package com.tello.leetcode.toofferii;

import java.util.HashMap;
import java.util.Map;

public class OfferII10 {
    public int subarraySum(int[] nums, int k) {
        int num = 0, pre = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            pre+=nums[i];
            if(map.containsKey(pre-k)){
                num+=map.get(pre-k);
            }
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        for (Integer key:map.keySet()) {
            System.out.println(map.get(key));
        }
        return num;
    }
}
