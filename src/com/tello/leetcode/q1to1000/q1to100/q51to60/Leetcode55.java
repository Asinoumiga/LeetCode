package com.tello.leetcode.q1to1000.q1to100.q51to60;

public class Leetcode55 {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int[] now = new int[nums.length];
        now[0] = nums[0];
        int i = 1;
        for (; i < nums.length&&i<=now[i-1]; i++) {
            now[i] = Math.max(now[i-1],i+nums[i]);
        }
        if(now[i-1]<nums.length-1){
            return false;
        }
        return true;
    }
}
