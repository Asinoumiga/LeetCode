package com.tello.leetcode.q1to1000.q1to100.q71to80;

import java.util.ArrayList;
import java.util.List;

public class Leetcode78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        result.add(temp);
        addSubsets(result,temp,nums,0);
        return result;
    }

    public void addSubsets(List<List<Integer>> result,List<Integer> temp,int[] nums,int pos){
        while (pos<nums.length){
            temp.add(nums[pos++]);
            addSubsets(result,temp,nums,pos);
            result.add(new ArrayList<>(temp));
            temp.remove(temp.size()-1);
        }
    }

}
