package com.tello.leetcode.toofferii;

import java.util.Arrays;

public class OfferII94 {
    public int minCut(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }
        char[] sChar = s.toCharArray();
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if(sChar[i]!=sChar[j]) {
                    dp[i][j]=false;
                }else {
                    if(i-j<=2) {
                        dp[i][j]=true;
                    }else {
                        dp[i][j]=dp[i-1][j+1];
                    }
                }
            }
        }

        int[] result = new int[s.length()];
        Arrays.fill(result, Integer.MAX_VALUE);
        for (int i = 0; i < s.length(); i++) {
            if(dp[i][0]){
                result[i]=0;
            } else{
                for (int j = 0; j < i; j++) {
                    if(dp[i][j+1]){
                        result[i] = Math.min(result[i],result[j]+1);
                    }
                }
            }
        }
        return result[s.length()-1];
    }
}
