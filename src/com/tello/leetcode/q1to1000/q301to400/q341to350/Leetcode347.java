package com.tello.leetcode.q1to1000.q301to400.q341to350;

import java.util.HashMap;

public class Leetcode347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] tempList = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            tempList[nums[i]]++;
        }
        return null;
    }
}
