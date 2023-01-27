package com.tello.leetcode.q1to1000.q201to300.q281to290;

public class Leetcode283 {
    public void moveZeroes(int[] nums) {
        int zeroNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                zeroNum++;
                continue;
            }
            if(zeroNum!=0){
                nums[i-zeroNum]=nums[i];
                nums[i]=0;
            }
        }
    }

}
