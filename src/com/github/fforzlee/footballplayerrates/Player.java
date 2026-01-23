package com.github.fforzlee.footballplayerrates;

/**
 * 球员模型类
 * Player model class for Liverpool FC 2025/2026 season
 */
public class Player {
    private String name;
    private int number;
    private Position position;
    private String nationality;
    private int appearances;
    private int goals;
    private int assists;
    private int cleanSheets; // 门将零封次数
    private int saves; // 门将扑救次数

    // Constructor for outfield players
    public Player(String name, int number, Position position, String nationality,
            int appearances, int goals, int assists) {
        this.name = name;
        this.number = number;
        this.position = position;
        this.nationality = nationality;
        this.appearances = appearances;
        this.goals = goals;
        this.assists = assists;
        this.cleanSheets = 0;
        this.saves = 0;
    }

    // Constructor for goalkeepers
    public Player(String name, int number, Position position, String nationality,
            int appearances, int cleanSheets, int saves, boolean isGoalkeeper) {
        this.name = name;
        this.number = number;
        this.position = position;
        this.nationality = nationality;
        this.appearances = appearances;
        this.goals = 0;
        this.assists = 0;
        this.cleanSheets = cleanSheets;
        this.saves = saves;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Position getPosition() {
        return position;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAppearances() {
        return appearances;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public int getCleanSheets() {
        return cleanSheets;
    }

    public int getSaves() {
        return saves;
    }

    // 计算场均进球
    public double getGoalsPerGame() {
        return appearances > 0 ? (double) goals / appearances : 0;
    }

    // 计算总贡献（进球+助攻）
    public int getTotalContributions() {
        return goals + assists;
    }

    @Override
    public String toString() {
        if (position == Position.GOALKEEPER) {
            return String.format("%-20s #%-3d %-12s %-8s 出场: %-3d 零封: %-3d 扑救: %-3d",
                    name, number, nationality, position.getChineseName(),
                    appearances, cleanSheets, saves);
        } else {
            return String.format("%-20s #%-3d %-12s %-8s 出场: %-3d 进球: %-3d 助攻: %-3d",
                    name, number, nationality, position.getChineseName(),
                    appearances, goals, assists);
        }
    }
}
