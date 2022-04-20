package com.tello.leetcode.q1to1000.q101to200.q191to200;

//198. ¥Úº“ΩŸ…·
public class Leetcode198 {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = nums[i-1];
            dp[i] = Math.max(dp[i-2]+dp[i],dp[i-1]);
        }
        return dp[dp.length-1];
    }
}
