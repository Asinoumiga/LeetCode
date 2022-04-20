package com.tello.leetcode.q1001to2000.q1201to1300.q1291to1300;

public class Leecode1295   {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if(String.valueOf(nums[i]).length()%2==0){
                result++;
            }
        }
        return result;
    }
}
