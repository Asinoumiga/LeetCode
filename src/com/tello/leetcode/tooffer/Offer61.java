package com.tello.leetcode.tooffer;

import java.util.Arrays;

//剑指 Offer 61. 扑克牌中的顺子
public class Offer61 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int zero=0;
        for (int i=0; i <nums.length-1; i++) {
            if(nums[i]==0){
                zero++;
            }else if(nums[i+1]-nums[i]>zero+1){
                return false;
            }else if(zero>0&&nums[i+1]-nums[i]==zero+1){
                zero--;
            }else if(nums[i+1]-nums[i]<1){
                return false;
            }
        }
        return true;
    }
}
