package com.tello.leetcode.q1to1000.q1to100.q71to80;

public class Leetcode72 {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        // 创建一个二维数组dp，其中dp[i][j]表示从word1的前i个字符转换到word2的前j个字符所需的最小操作数
        int[][] dp = new int[n + 1][m + 1];

        // 初始化数组dp的第0行和第0列，因为在没有任何字符的情况下转换到一个单词需要的操作数为该单词的字符数
        for (int i = 0; i <= n; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j;
        }

        // 使用动态规划更新dp数组
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
                }
            }
        }

        return dp[n][m];
    }
}
