package com.tello.leetcode.q1to1000.q1to100.q41to50;

import java.util.*;

public class Leetcode47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        intoUnique(result,new ArrayList<>(),map.entrySet(),nums.length);
        return result;
    }

    public void intoUnique(List<List<Integer>> result,List<Integer> temp,Set<Map.Entry<Integer,Integer>> entrySet,int length){
        if(temp.size()==length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for (Map.Entry<Integer,Integer> enty:entrySet) {
            if(enty.getValue()!=0){
                temp.add(enty.getKey());
                enty.setValue(enty.getValue()-1);
                intoUnique(result,temp,entrySet,length);
                temp.remove(temp.size()-1);
                enty.setValue(enty.getValue()+1);
            }
        }
    }
}
