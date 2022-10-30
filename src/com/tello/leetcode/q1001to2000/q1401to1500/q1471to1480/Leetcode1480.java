package com.tello.leetcode.q1001to2000.q1401to1500.q1471to1480;

public class Leetcode1480 {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
}
