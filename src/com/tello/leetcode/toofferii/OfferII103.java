package com.tello.leetcode.toofferii;

import java.util.Arrays;

public class OfferII103 {
    public int coinChange(int[] coins, int amount) {

        int[] result = new int[amount+1];
        Arrays.fill(result,Integer.MAX_VALUE);
        result[0] = 0;
        for (int i = 0; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if(i>=coins[j]&&result[i-coins[j]]!=Integer.MAX_VALUE){
                    result[i] = Math.min(result[i],result[i-coins[j]]+1);
                }
            }
        }
        return result[amount]==Integer.MAX_VALUE?-1:result[amount];
    }
}
