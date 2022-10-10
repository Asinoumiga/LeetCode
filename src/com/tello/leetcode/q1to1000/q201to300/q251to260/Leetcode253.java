package com.tello.leetcode.q1to1000.q201to300.q251to260;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Leetcode253 {
    public int minMeetingRooms(int[][] intervals) {
        int[] inList = new int[intervals.length];
        int[] outList = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            inList[i]=intervals[i][0];
            outList[i]= intervals[i][1];
        }
        Arrays.sort(inList);
        Arrays.sort(outList);
        int max = 0;
        int now = 0;
        int inNum = 0;
        int outNum = 0;
        while (inNum<inList.length&&outNum<outList.length){
            if(inList[inNum]<outList[outNum]){
                now++;
                if(now>max){
                    max=now;
                }
                inNum++;
            }else if(inList[inNum]==outList[outNum]){
                inNum++;
                outNum++;
            }else{
                now--;
                outNum++;
            }
        }
        return max;
    }
}
