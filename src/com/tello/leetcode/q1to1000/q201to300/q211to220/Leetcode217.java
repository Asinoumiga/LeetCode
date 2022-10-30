package com.tello.leetcode.q1to1000.q201to300.q211to220;

import java.util.HashSet;
import java.util.Set;

public class Leetcode217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }
        if(nums.length>numSet.size()){
            return true;
        }
        return false;
    }
}
