package com.tello.leetcode.tooffer;

import java.util.HashSet;
import java.util.Set;

//剑指 Offer 03. 数组中重复的数字
public class Offer03 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> aSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!aSet.add(nums[i])){
                return nums[i];
            }
        }
        return -1;
    }
}
