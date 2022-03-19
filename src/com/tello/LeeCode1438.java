package com.tello;

import java.util.TreeMap;

//1438. 绝对差不超过限制的最长连续子数组
public class LeeCode1438 {
	public static int longestSubarray(int[] nums, int limit) {
	        TreeMap<Integer, Integer> m = new TreeMap<>();
	        int left = 0, right = 0;
	        int res = 0;
	        while (right < nums.length) {
	            m.put(nums[right], m.getOrDefault(nums[right], 0) + 1);
	            System.out.println(m.firstKey());
	            while (m.lastKey() - m.firstKey() > limit) {
	                m.put(nums[left], m.get(nums[left]) - 1);
	                if (m.get(nums[left]) == 0) {
	                    m.remove(nums[left]);
	                }
	                left ++;
	            }
	            res = Math.max(res, right - left + 1);
	            right ++;
	        }
	        return res;
    }
	
	public static void main(String[] args) {
		int[] nums = {10,7,1,2,4,7,2};
		System.out.println(longestSubarray(nums,5));
	}
}
