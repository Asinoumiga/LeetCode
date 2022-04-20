package com.tello.leetcode.q1to1000.q1to100.q41to50;

public class Leetcode41 {
    public int firstMissingPositive(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0&&nums[i]<=nums.length&&nums[nums[i]-1]!=nums[i]){
                temp = nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i] = temp;
                i--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(i+1!=nums[i]){
                return i+1;
            }
        }
        return nums.length+1;
    }
}
