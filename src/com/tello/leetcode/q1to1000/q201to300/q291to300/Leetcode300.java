package com.tello.leetcode.q1to1000.q201to300.q291to300;

import java.util.Arrays;

public class Leetcode300 {
    public int lengthOfLIS(int[] nums) {
        int[] temps = new int[nums.length];
        Arrays.fill(temps,1);
        int result=1;
//        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i]>nums[j]){
                    temps[i] = Math.max(temps[i],temps[j]+1);
                }
            }
            if(result<temps[i]){
                result = temps[i];
            }
        }
        return result;
    }
}
