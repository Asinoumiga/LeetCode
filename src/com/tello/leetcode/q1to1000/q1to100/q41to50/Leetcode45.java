package com.tello.leetcode.q1to1000.q1to100.q41to50;

import java.util.Arrays;

public class Leetcode45 {
    public int jump(int[] nums) {
        int[] jumpNum = new int[nums.length];
        Arrays.fill(jumpNum,10000);
        jumpNum[0] = 0;
        int nowNum = 1;
        for (int i = 0; i < nums.length&&nowNum<nums.length; i++) {
            for (int j = nowNum; j <= i+nums[i]&&j<nums.length; j++) {
                jumpNum[j] = Math.min(jumpNum[j],jumpNum[i]+1);
                nowNum++;
            }
            System.out.println(jumpNum[i]);
        }
        return jumpNum[jumpNum.length-1];
    }
}
