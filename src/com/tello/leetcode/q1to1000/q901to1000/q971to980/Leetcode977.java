package com.tello.leetcode.q1to1000.q901to1000.q971to980;

import java.util.Arrays;

public class Leetcode977 {
    public int[] sortedSquares(int[] nums) {
        int pre = 0;
        int back = nums.length-1;
        int pos = nums.length-1;
        int[] result = new int[nums.length];
        while (back>=pre){
            if(Math.abs(nums[back])>=Math.abs(nums[pre])){
                result[pos] = nums[back]*nums[back];
                back--;
            }else{
                result[pos] = nums[pre]*nums[pre];
                pre++;
            }
        }
        return result;
    }
//    public int[] sortedSquares(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = (int) Math.pow(nums[i],2);
//        }
//        Arrays.sort(nums);
//        return nums;
//    }
}
