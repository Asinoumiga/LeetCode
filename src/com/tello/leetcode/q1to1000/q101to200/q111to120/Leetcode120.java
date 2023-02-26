package com.tello.leetcode.q1to1000.q101to200.q111to120;

import java.util.List;

public class Leetcode120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> preList = triangle.get(0);
        for (int i = 1; i < triangle.size() ; i++) {
            List<Integer> tempList = triangle.get(i);
            for (int j = 0; j < tempList.size(); j++) {
                int max = 0;
                if(j==0){
                    max = preList.get(j);
                }else if(j==tempList.size()-1){
                    max = preList.get(j-1);
                }else {
                    max = Math.min(preList.get(j),preList.get(j-1));
                }
                tempList.set(j,tempList.get(j)+max);
            }
            preList = tempList;
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < preList.size(); i++) {
            if(result>preList.get(i)){
                result = preList.get(i);
            }
        }
        return result;
    }
}
