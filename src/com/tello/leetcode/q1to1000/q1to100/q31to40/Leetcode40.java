package com.tello.leetcode.q1to1000.q1to100.q31to40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        intoit(result,new ArrayList<>(),candidates,0,target);
        return result;
    }

    public void intoit(List<List<Integer>> result,List<Integer> temp,int[] candidates,int now,int target){
        if(target == 0){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(now>=candidates.length){
            return;
        }
        for (int i = now; i < candidates.length; i++) {
            if(candidates[i]>target){
                return;
            }
            temp.add(candidates[i]);
            intoit(result,temp,candidates,i+1,target-candidates[i]);
            temp.remove(temp.size()-1);
            while (i+1<candidates.length&&candidates[i]==candidates[i+1]){
                i++;
            }
        }
    }
}
