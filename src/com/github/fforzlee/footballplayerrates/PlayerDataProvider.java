package com.github.fforzlee.footballplayerrates;

import java.util.ArrayList;
import java.util.List;

/**
 * 球员数据提供类
 * Provides Liverpool FC 2025/2026 season first-team player data
 */
public class PlayerDataProvider {

    private List<Player> players;

    public PlayerDataProvider() {
        players = new ArrayList<>();
        initializeData();
    }

    /**
     * 初始化利物浦2025/2026赛季一线队球员数据
     * 数据来源：Premier League, UEFA, Transfermarkt 等官方统计
     */
    private void initializeData() {
        // ==================== 门将 Goalkeepers ====================
        players.add(new Player("Alisson Becker", 1, Position.GOALKEEPER, "巴西",
                17, 6, 34, true));
        players.add(new Player("Giorgi Mamardashvili", 13, Position.GOALKEEPER, "格鲁吉亚",
                11, 2, 25, true));

        // ==================== 后卫 Defenders ====================
        players.add(new Player("Virgil van Dijk", 4, Position.DEFENDER, "荷兰",
                22, 2, 0));
        players.add(new Player("Joe Gomez", 12, Position.DEFENDER, "英格兰",
                18, 0, 1));
        players.add(new Player("Ibrahima Konaté", 5, Position.DEFENDER, "法国",
                20, 1, 0));
        players.add(new Player("Andy Robertson", 26, Position.DEFENDER, "苏格兰",
                19, 0, 4));
        players.add(new Player("Conor Bradley", 66, Position.DEFENDER, "北爱尔兰",
                15, 1, 3));
        players.add(new Player("Jeremie Frimpong", 2, Position.DEFENDER, "荷兰",
                16, 2, 5));
        players.add(new Player("Milos Kerkez", 3, Position.DEFENDER, "匈牙利",
                14, 0, 2));

        // ==================== 中场 Midfielders ====================
        players.add(new Player("Florian Wirtz", 14, Position.MIDFIELDER, "德国",
                21, 3, 1));
        players.add(new Player("Alexis Mac Allister", 10, Position.MIDFIELDER, "阿根廷",
                21, 0, 2));
        players.add(new Player("Dominik Szoboszlai", 8, Position.MIDFIELDER, "匈牙利",
                29, 2, 1));
        players.add(new Player("Ryan Gravenberch", 38, Position.MIDFIELDER, "荷兰",
                20, 4, 0));
        players.add(new Player("Curtis Jones", 17, Position.MIDFIELDER, "英格兰",
                18, 2, 3));
        players.add(new Player("Wataru Endo", 25, Position.MIDFIELDER, "日本",
                12, 0, 1));

        // ==================== 前锋 Forwards ====================
        players.add(new Player("Mohamed Salah", 11, Position.FORWARD, "埃及",
                14, 4, 3));
        players.add(new Player("Alexander Isak", 9, Position.FORWARD, "瑞典",
                10, 2, 1));
        players.add(new Player("Hugo Ekitike", 7, Position.FORWARD, "法国",
                19, 8, 2));
        players.add(new Player("Cody Gakpo", 18, Position.FORWARD, "荷兰",
                20, 5, 2));
        players.add(new Player("Federico Chiesa", 19, Position.FORWARD, "意大利",
                8, 1, 1));
    }

    /**
     * 获取所有球员
     */
    public List<Player> getAllPlayers() {
        return new ArrayList<>(players);
    }

    /**
     * 根据位置获取球员
     */
    public List<Player> getPlayersByPosition(Position position) {
        List<Player> result = new ArrayList<>();
        for (Player player : players) {
            if (player.getPosition() == position) {
                result.add(player);
            }
        }
        return result;
    }

    /**
     * 获取进球榜（按进球数降序）
     */
    public List<Player> getTopScorers(int limit) {
        List<Player> outfieldPlayers = new ArrayList<>();
        for (Player player : players) {
            if (player.getPosition() != Position.GOALKEEPER) {
                outfieldPlayers.add(player);
            }
        }

        // 按进球数排序
        outfieldPlayers.sort((p1, p2) -> p2.getGoals() - p1.getGoals());

        return outfieldPlayers.subList(0, Math.min(limit, outfieldPlayers.size()));
    }

    /**
     * 获取助攻榜（按助攻数降序）
     */
    public List<Player> getTopAssisters(int limit) {
        List<Player> outfieldPlayers = new ArrayList<>();
        for (Player player : players) {
            if (player.getPosition() != Position.GOALKEEPER) {
                outfieldPlayers.add(player);
            }
        }

        // 按助攻数排序
        outfieldPlayers.sort((p1, p2) -> p2.getAssists() - p1.getAssists());

        return outfieldPlayers.subList(0, Math.min(limit, outfieldPlayers.size()));
    }

    /**
     * 获取总贡献榜（进球+助攻）
     */
    public List<Player> getTopContributors(int limit) {
        List<Player> outfieldPlayers = new ArrayList<>();
        for (Player player : players) {
            if (player.getPosition() != Position.GOALKEEPER) {
                outfieldPlayers.add(player);
            }
        }

        // 按总贡献排序
        outfieldPlayers.sort((p1, p2) -> p2.getTotalContributions() - p1.getTotalContributions());

        return outfieldPlayers.subList(0, Math.min(limit, outfieldPlayers.size()));
    }

    /**
     * 获取球员总数
     */
    public int getPlayerCount() {
        return players.size();
    }
}
