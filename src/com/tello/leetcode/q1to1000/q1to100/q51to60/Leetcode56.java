package com.tello.leetcode.q1to1000.q1to100.q51to60;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Leetcode56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        List<int[]> list = new LinkedList<>(Arrays.asList(intervals));
        int pre = 0;
        int back = 1;
        while(pre <list.size() && back < list.size()){
            int[] preRange = list.get(pre);
            int[] backRange = list.get(back);
            if(preRange[1]>=backRange[0]){
                preRange[1] = Math.max(preRange[1], backRange[1]);
                list.remove(back);
            }else{
                pre++;
                back++;
            }
        }
        return list.toArray(new int[0][0]);
    }

}
