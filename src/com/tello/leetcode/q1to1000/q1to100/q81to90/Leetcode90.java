package com.tello.leetcode.q1to1000.q1to100.q81to90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        intoNums(result,new ArrayList<>(),nums,0);
        return result;
    }

    public void intoNums(List<List<Integer>> result,List<Integer> temp,int[] nums,int now){
        result.add(new ArrayList<>(temp));
        for (int i = now; i < nums.length; i++) {

            temp.add(nums[i]);
            intoNums(result,temp,nums,i+1);
            temp.remove(temp.size()-1);
            while (i+1<nums.length&&nums[i+1]==nums[i]){
                i++;
            }
        }
    }
}
