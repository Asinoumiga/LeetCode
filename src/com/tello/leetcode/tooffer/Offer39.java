package com.tello.leetcode.tooffer;

import java.util.Arrays;

public class Offer39 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
