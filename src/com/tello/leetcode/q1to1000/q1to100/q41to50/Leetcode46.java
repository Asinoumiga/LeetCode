package com.tello.leetcode.q1to1000.q1to100.q41to50;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> enty = new LinkedList();
        enty.add(nums[0]);
        result.add(enty);
        result = doList(result,nums,1);
        return result;
    }
    public List<List<Integer>> doList(List<List<Integer>> result,int[] nums,int index) {
        if(index>=nums.length){
            return result;
        }
        List<List<Integer>> inResult = new ArrayList();
        for(int i=0;i<result.size();i++){
            for (int j = 0; j <= index; j++) {
                LinkedList<Integer> enty = new LinkedList(result.get(i));
                enty.add(j,nums[index]);
                inResult.add(enty);
            }
        }
        return doList(inResult,nums,index+1);
    }
}
