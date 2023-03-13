package com.tello.leetcode.q1to1000.q401to500.q491to500;

import java.util.*;

public class Leetcode496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> cache = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = nums2.length-1; i >=0; i--) {
            while (!stack.isEmpty()&&stack.peek()<=nums2[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                cache.put(nums2[i],-1);
            }else{
                cache.put(nums2[i],stack.peek());
            }
            stack.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = cache.get(nums1[i]);
        }
        return nums1;
    }
}
