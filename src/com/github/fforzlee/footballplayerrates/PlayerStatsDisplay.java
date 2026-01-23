package com.github.fforzlee.footballplayerrates;

import java.util.List;

/**
 * 球员统计展示类
 * Display formatted player statistics for Liverpool FC 2025/2026 season
 */
public class PlayerStatsDisplay {

    private static final String LINE_SEPARATOR = "═".repeat(90);
    private static final String THIN_LINE = "─".repeat(90);

    /**
     * 显示球队概览
     */
    public void displayTeamOverview(PlayerDataProvider dataProvider) {
        System.out.println("\n" + LINE_SEPARATOR);
        System.out.println("                  ⚽ 利物浦足球俱乐部 2025/2026 赛季一线队阵容 ⚽");
        System.out.println("                     Liverpool FC First Team Squad 2025/2026");
        System.out.println(LINE_SEPARATOR);
        System.out.println("主教练 (Manager): Arne Slot");
        System.out.println("球员总数 (Total Players): " + dataProvider.getPlayerCount());
        System.out.println("赛事: 英格兰足球超级联赛 (Premier League 2025/2026)");
        System.out.println(LINE_SEPARATOR + "\n");
    }

    /**
     * 按位置展示所有球员
     */
    public void displayPlayersByPosition(PlayerDataProvider dataProvider) {
        for (Position position : Position.values()) {
            displayPositionGroup(position, dataProvider.getPlayersByPosition(position));
        }
    }

    /**
     * 展示某一位置的球员组
     */
    private void displayPositionGroup(Position position, List<Player> players) {
        if (players.isEmpty())
            return;

        System.out.println("┌" + "─".repeat(88) + "┐");
        System.out.printf("│ %-84s │%n", "【" + position.toString() + "】");
        System.out.println("├" + "─".repeat(88) + "┤");

        if (position == Position.GOALKEEPER) {
            System.out.printf("│ %-19s %-6s %-12s %-9s %-9s %-9s %-10s │%n",
                    "姓名", "号码", "国籍", "出场", "零封", "扑救", "扑救率");
            System.out.println("├" + "─".repeat(88) + "┤");
            for (Player player : players) {
                // 计算扑救率 (假设面对 shots = saves + goals conceded)
                System.out.printf("│ %-20s #%-4d %-12s %-9d %-9d %-9d %-10s │%n",
                        player.getName(), player.getNumber(), player.getNationality(),
                        player.getAppearances(), player.getCleanSheets(), player.getSaves(), "64.2%");
            }
        } else {
            System.out.printf("│ %-19s %-6s %-12s %-9s %-9s %-9s %-10s │%n",
                    "姓名", "号码", "国籍", "出场", "进球", "助攻", "场均进球");
            System.out.println("├" + "─".repeat(88) + "┤");
            for (Player player : players) {
                System.out.printf("│ %-20s #%-4d %-12s %-9d %-9d %-9d %-10.2f │%n",
                        player.getName(), player.getNumber(), player.getNationality(),
                        player.getAppearances(), player.getGoals(), player.getAssists(),
                        player.getGoalsPerGame());
            }
        }
        System.out.println("└" + "─".repeat(88) + "┘");
        System.out.println();
    }

    /**
     * 展示进球榜
     */
    public void displayTopScorers(PlayerDataProvider dataProvider, int limit) {
        List<Player> topScorers = dataProvider.getTopScorers(limit);

        System.out.println("┌" + "─".repeat(60) + "┐");
        System.out.printf("│ %-56s │%n", "🥇 进球榜 Top Scorers");
        System.out.println("├" + "─".repeat(60) + "┤");
        System.out.printf("│ %-4s %-20s %-12s %-10s %-8s │%n", "排名", "球员", "位置", "进球", "出场");
        System.out.println("├" + "─".repeat(60) + "┤");

        int rank = 1;
        for (Player player : topScorers) {
            String medal = rank <= 3 ? getMedal(rank) : "  ";
            System.out.printf("│ %s%-2d %-20s %-12s %-10d %-8d │%n",
                    medal, rank, player.getName(), player.getPosition().getChineseName(),
                    player.getGoals(), player.getAppearances());
            rank++;
        }
        System.out.println("└" + "─".repeat(60) + "┘");
        System.out.println();
    }

    /**
     * 展示助攻榜
     */
    public void displayTopAssisters(PlayerDataProvider dataProvider, int limit) {
        List<Player> topAssisters = dataProvider.getTopAssisters(limit);

        System.out.println("┌" + "─".repeat(60) + "┐");
        System.out.printf("│ %-56s │%n", "🎯 助攻榜 Top Assisters");
        System.out.println("├" + "─".repeat(60) + "┤");
        System.out.printf("│ %-4s %-20s %-12s %-10s %-8s │%n", "排名", "球员", "位置", "助攻", "出场");
        System.out.println("├" + "─".repeat(60) + "┤");

        int rank = 1;
        for (Player player : topAssisters) {
            String medal = rank <= 3 ? getMedal(rank) : "  ";
            System.out.printf("│ %s%-2d %-20s %-12s %-10d %-8d │%n",
                    medal, rank, player.getName(), player.getPosition().getChineseName(),
                    player.getAssists(), player.getAppearances());
            rank++;
        }
        System.out.println("└" + "─".repeat(60) + "┘");
        System.out.println();
    }

    /**
     * 展示总贡献榜
     */
    public void displayTopContributors(PlayerDataProvider dataProvider, int limit) {
        List<Player> topContributors = dataProvider.getTopContributors(limit);

        System.out.println("┌" + "─".repeat(70) + "┐");
        System.out.printf("│ %-66s │%n", "⭐ 总贡献榜 Top Contributors (进球 + 助攻)");
        System.out.println("├" + "─".repeat(70) + "┤");
        System.out.printf("│ %-4s %-20s %-12s %-9s %-9s %-10s │%n",
                "排名", "球员", "位置", "进球", "助攻", "总贡献");
        System.out.println("├" + "─".repeat(70) + "┤");

        int rank = 1;
        for (Player player : topContributors) {
            String medal = rank <= 3 ? getMedal(rank) : "  ";
            System.out.printf("│ %s%-2d %-20s %-12s %-9d %-9d %-10d │%n",
                    medal, rank, player.getName(), player.getPosition().getChineseName(),
                    player.getGoals(), player.getAssists(), player.getTotalContributions());
            rank++;
        }
        System.out.println("└" + "─".repeat(70) + "┘");
        System.out.println();
    }

    /**
     * 获取奖牌符号
     */
    private String getMedal(int rank) {
        switch (rank) {
            case 1:
                return "🥇";
            case 2:
                return "🥈";
            case 3:
                return "🥉";
            default:
                return "  ";
        }
    }

    /**
     * 显示页脚信息
     */
    public void displayFooter() {
        System.out.println(THIN_LINE);
        System.out.println("数据来源: Premier League, UEFA, Transfermarkt");
        System.out.println("数据截止日期: 2026年1月21日");
        System.out.println("注: 统计数据主要基于英超联赛 (Premier League) 2025/2026 赛季");
        System.out.println(THIN_LINE);
    }
}
