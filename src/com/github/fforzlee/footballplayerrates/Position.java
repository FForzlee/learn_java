package com.github.fforzlee.footballplayerrates;

/**
 * 球员位置枚举
 * Player position enumeration for Liverpool FC
 */
public enum Position {
    GOALKEEPER("门将", "Goalkeeper"),
    DEFENDER("后卫", "Defender"),
    MIDFIELDER("中场", "Midfielder"),
    FORWARD("前锋", "Forward");

    private final String chineseName;
    private final String englishName;

    Position(String chineseName, String englishName) {
        this.chineseName = chineseName;
        this.englishName = englishName;
    }

    public String getChineseName() {
        return chineseName;
    }

    public String getEnglishName() {
        return englishName;
    }

    @Override
    public String toString() {
        return chineseName + " (" + englishName + ")";
    }
}
