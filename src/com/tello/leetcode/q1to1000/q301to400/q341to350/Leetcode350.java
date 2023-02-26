package com.tello.leetcode.q1to1000.q301to400.q341to350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> resultList = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;
        while (index1<nums1.length&&index2<nums2.length){
            if(nums1[index1]<nums2[index2]){
                index1++;
            }else if(nums1[index1]>nums2[index2]){
                index2++;
            }else{
                resultList.add(nums1[index1]);
                index1++;
                index2++;
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
