package com.tello.leetcode.toofferii;

public class OfferII90 {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] resultA = new int[nums.length];
        int[] resultB = new int[nums.length];
        resultA[0] = 0;
        resultA[1] = nums[0];
        resultB[0] = 0;
        resultB[1] = nums[1];

        for (int i = 2; i < nums.length; i++) {
            resultA[i] = Math.max(resultA[i-1],nums[i-1]+resultA[i-2]);
            resultB[i] = Math.max(resultB[i-1],nums[i]+resultB[i-2]);
        }

        return Math.max(resultA[nums.length-1],resultB[nums.length-1]);
    }
}
