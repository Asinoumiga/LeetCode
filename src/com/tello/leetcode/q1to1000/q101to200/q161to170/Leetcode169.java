package com.tello.leetcode.q1to1000.q101to200.q161to170;

import java.util.Arrays;

public class Leetcode169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
