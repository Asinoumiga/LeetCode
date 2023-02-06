package com.tello.leetcode.q1to1000.q1to100.q31to40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        testCombination(result,new ArrayList<>(),candidates,0,0,target);
        return result;
    }

    void testCombination(List<List<Integer>> result,List<Integer> temp, int[] candidates,int nowValue,int nowIndex, int target){
        for (int i = nowIndex; i < candidates.length; i++) {
            int value = nowValue+candidates[i];
            if(value<target){
                temp.add(candidates[i]);
                testCombination(result,temp,candidates,value,i,target);
                temp.remove(temp.size()-1);
            }else if(value==target){
                temp.add(candidates[i]);
                result.add(new ArrayList<>(temp));
                temp.remove(temp.size()-1);
            }else{
                break;
            }
        }
    }
}
