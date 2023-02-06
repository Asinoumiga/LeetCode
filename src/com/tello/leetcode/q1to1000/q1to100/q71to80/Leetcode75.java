package com.tello.leetcode.q1to1000.q1to100.q71to80;

import java.util.Arrays;

public class Leetcode75 {
    public void sortColors(int[] nums) {
        int[] numList = new int[3];
        for (int i = 0; i < nums.length; i++) {
            numList[nums[i]]++;
        }
        Arrays.fill(nums,0,numList[0],0);
        Arrays.fill(nums,numList[0],numList[0]+numList[1],1);
        Arrays.fill(nums,numList[0]+numList[1],nums.length,2);
    }
}
