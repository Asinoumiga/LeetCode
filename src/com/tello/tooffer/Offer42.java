package com.tello.tooffer;

//��ָ Offer 42. ���������������
public class Offer42 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int nowSum =nums[0];
        dp[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            nowSum = Math.max(nowSum+nums[i],nums[i]);
            dp[i] = Math.max(dp[i-1],nowSum);
        }
        return dp[nums.length-1];
    }
}
