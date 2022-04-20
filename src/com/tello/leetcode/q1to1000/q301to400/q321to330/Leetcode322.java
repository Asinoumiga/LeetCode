package com.tello.leetcode.q1to1000.q301to400.q321to330;

import java.util.Arrays;

public class Leetcode322 {


    public int coinChange(int[] coins, int amount) {
        if(amount==0){
            return 0;
        }
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                if(coins[j]<=i){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
            System.out.println(dp[i]);
        }
        return dp[amount]>amount?-1:dp[amount];
    }

}
