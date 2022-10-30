package com.tello.leetcode.q1to1000.q301to400.q321to330;

import java.util.HashMap;
import java.util.Map;

public class Leetcode325 {
    public int maxSubArrayLen(int[] nums, int k) {
//        int max = 0;
//        boolean needCheck = true;
//        for (int i = 0; i < nums.length; i++) {
//            needCheck = true;
//            for (int j = 0; j < i; j++) {
//                nums[j] = nums[j]+nums[i];
//                if(nums[j]==k&&needCheck&&max<i-j+1){
//                    max = i-j+1;
//                    needCheck = false;
//                }
//            }
//            if(nums[i]==k&&max==0){
//                max = 1;
//            }
//        }
//        return max;
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int result = 0;
        int preSum = 0;
        preSumMap.put(0, -1);
        for (int i = 0; i < nums.length; ++i) {
            preSum += nums[i];
            if (!preSumMap.containsKey(preSum)) {
                preSumMap.put(preSum, i);
            }
            if (preSumMap.containsKey(preSum - k)) {
                result = Math.max(result, i - preSumMap.get(preSum - k));
            }
        }
        return result;
    }
}
