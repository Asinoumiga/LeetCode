package com.tello.leetcode.q1to1000.q301to400.q341to350;

import java.util.*;

public class Leetcode349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = nums1;
        List<Integer> resultList = new ArrayList<>();
        if(nums1.length>nums2.length){
            nums1 = nums2;
            nums2 = temp;
        }
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            numSet.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if(numSet.contains(nums2[i])){
                resultList.add(nums2[i]);
                numSet.remove(nums2[i]);
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
