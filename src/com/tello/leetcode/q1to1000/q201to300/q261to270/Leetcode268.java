package com.tello.leetcode.q1to1000.q201to300.q261to270;

public class Leetcode268 {
    public int missingNumber(int[] nums) {
        boolean[] temp = new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
            temp[nums[i]] = true;
        }
        for(int i=0;i<temp.length;i++){
            if(!temp[i]){
                return i;
            }
        }
        return -1;
    }
}
