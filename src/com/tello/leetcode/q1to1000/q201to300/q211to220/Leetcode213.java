package com.tello.leetcode.q1to1000.q201to300.q211to220;

public class Leetcode213 {
    public int rob(int[] nums) {
        int[] result = new int[nums.length];
        int[] result2 = new int[nums.length];
        result[0] = 0;
        result[1] = nums[0];
        result2[0] = 0;
        result2[1] = nums[1];

        for (int i = 1; i < nums.length-1; i++) {
            result[i+1] = Math.max(result[i],result[i-1]+nums[i]);
            result2[i+1] = Math.max(result[i],result[i-1]+nums[i+1]);
        }

        return Math.max(result[result.length-1],result2[result2.length-1]);
    }
}
