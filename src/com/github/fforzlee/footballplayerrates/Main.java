package com.github.fforzlee.footballplayerrates;

/**
 * 主程序入口
 * Main class for Liverpool FC 2025/2026 Player Statistics Display
 * 
 * 功能:
 * - 展示利物浦一线队完整阵容
 * - 按位置分类展示球员信息
 * - 展示进球榜、助攻榜、总贡献榜
 */
public class Main {

    public static void main(String[] args) {
        // 初始化数据提供者
        PlayerDataProvider dataProvider = new PlayerDataProvider();

        // 初始化展示器
        PlayerStatsDisplay display = new PlayerStatsDisplay();

        // 1. 显示球队概览
        display.displayTeamOverview(dataProvider);

        // 2. 按位置展示所有球员
        System.out.println("📋 球员阵容详情 (按位置分类)\n");
        display.displayPlayersByPosition(dataProvider);

        // 3. 显示进球榜 (前5名)
        display.displayTopScorers(dataProvider, 5);

        // 4. 显示助攻榜 (前5名)
        display.displayTopAssisters(dataProvider, 5);

        // 5. 显示总贡献榜 (前5名)
        display.displayTopContributors(dataProvider, 5);

        // 6. 显示页脚
        display.displayFooter();
    }
}
