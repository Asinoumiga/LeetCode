package com.tello.leetcode.q1to1000.q1to100.q71to80;

import java.util.ArrayList;
import java.util.List;

public class Leetcode77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] now = new boolean[n];
        inToCombine(result,new ArrayList<>(),now,k,0);
        return result;
    }

    public void inToCombine(List<List<Integer>> result,List<Integer> temp,boolean[] now,int k,int index){
        if(k==0){
            result.add(new ArrayList(temp));
            return;
        }
        for (int i = index; i < now.length; i++) {
            if(!now[i]){
                temp.add(i+1);
                now[i]=true;
                inToCombine(result,temp,now,k-1,i+1);
                temp.remove(temp.size()-1);
                now[i]=false;
            }
        }
    }
}
