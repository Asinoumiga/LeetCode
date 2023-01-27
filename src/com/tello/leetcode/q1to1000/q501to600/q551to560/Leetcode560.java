package com.tello.leetcode.q1to1000.q501to600.q551to560;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode560 {
    public int subarraySum(int[] nums, int k) {
        int result = 0;
        Set numSet = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                nums[j]+=nums[i];
                if(nums[j]==k){
                    result++;
                }
            }
            if(nums[i]==k){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(false&&true||false&&true);
    }
}
