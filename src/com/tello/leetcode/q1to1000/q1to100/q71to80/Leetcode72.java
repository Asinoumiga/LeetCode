package com.tello.leetcode.q1to1000.q1to100.q71to80;

public class Leetcode72 {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        // ����һ����ά����dp������dp[i][j]��ʾ��word1��ǰi���ַ�ת����word2��ǰj���ַ��������С������
        int[][] dp = new int[n + 1][m + 1];

        // ��ʼ������dp�ĵ�0�к͵�0�У���Ϊ��û���κ��ַ��������ת����һ��������Ҫ�Ĳ�����Ϊ�õ��ʵ��ַ���
        for (int i = 0; i <= n; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j;
        }

        // ʹ�ö�̬�滮����dp����
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
