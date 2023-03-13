package com.tello.leetcode.q1to1000.q701to800.q741to750;

public class Leetcode746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] result = new int[cost.length];
        result[0] = cost[0];
        result[1] = cost[1];
        for (int i = 2; i <cost.length ; i++) {
            result[i] = Math.min(result[i-2],result[i-1])+cost[i];
        }
        return Math.min(result[cost.length-2],result[cost.length-1]);
    }
}
