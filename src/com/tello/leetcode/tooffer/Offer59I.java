package com.tello.leetcode.tooffer;

public class Offer59I {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==0){
            return new int[0];
        }else if(k==1){
            return nums;
        }
        int max = Integer.MIN_VALUE;
        int maxPos = -1;
        int secMax = Integer.MIN_VALUE;
        int secordPos = -1;
        int[] result = new int[nums.length-k+1];

        for (int i = 0,j = 0; i < result.length; j++) {
            if(j<nums.length) {
                if (nums[j] >= max) {
                    max = nums[j];
                    maxPos = j;
                    secMax = Integer.MIN_VALUE;
                    secordPos = -1;
                } else if (nums[j] < max && nums[j] >= secMax) {
                    secMax = nums[j];
                    secordPos = j;
                }
            }
            if(j<k-1){continue;}
            if (i>0&&maxPos == i-1) {
                max = secMax;
                maxPos = secordPos;
                secMax = Integer.MIN_VALUE;
                secordPos = -1;
                for (int l = maxPos+1; l <= j; l++) {
                    if (nums[l] >= secMax) {
                        secMax = nums[l];
                        secordPos = l;
                    }
                }
            }
            result[i++] = max;
        }
        return result;
    }
}
