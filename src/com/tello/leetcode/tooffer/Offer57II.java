package com.tello.leetcode.tooffer;

import java.util.ArrayList;
import java.util.List;

//剑指 Offer 57 - II. 和为s的连续正数序列
public class Offer57II {
    public int[][] findContinuousSequence(int target) {
        int pre = 1;
        int back = 2;
        int sum = 0;
        List<int[]> resultList = new ArrayList<>();
        while (back<=target/2+1){
            sum = (pre+back)*(back-pre)/2;
            if(sum<target){
                back++;
            }else if(sum>target){
                pre++;
            }else{
                int[] inResult = new int[back-pre+1];
                for(int i=0;i<back-pre+1;i++){
                    inResult[i]=pre+i;
                }
                resultList.add(inResult);
                pre++;
                back++;
            }
        }
        int[][] result = new int[resultList.size()][];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
