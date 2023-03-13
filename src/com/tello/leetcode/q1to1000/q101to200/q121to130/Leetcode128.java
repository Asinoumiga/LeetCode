package com.tello.leetcode.q1to1000.q101to200.q121to130;

import java.util.HashSet;
import java.util.Set;

public class Leetcode128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> cache = new HashSet<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            cache.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++){
            if(!cache.contains(nums[i])){
                continue;
            }
            cache.remove(nums[i]);
            int num = 1;
            int pre = nums[i]+1;
            int back= nums[i]-1;
            while (cache.contains(pre)){
                num++;
                cache.remove(pre++);
            }
            while (cache.contains(back)){
                num++;
                cache.remove(back--);
            }
            if(num>result){
                result = num;
            }
        }
        return result;
    }
}
