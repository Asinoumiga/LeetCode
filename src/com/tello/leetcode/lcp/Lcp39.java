package com.tello.leetcode.lcp;

import java.util.ArrayList;
import java.util.List;

public class Lcp39 {
    public int minimumSwitchingTimes(int[][] source, int[][] target) {
        int[] pre = new int[1000];
        int[] back = new int[1000];
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[i].length; j++) {
                pre[source[i][j]]++;
                back[target[i][j]]++;
            }
        }
        int result = 0;
        for (int i = 0; i < pre.length; i++) {
            if(pre[i]-back[i]>0){
                result+=pre[i]-back[i];
            }
        }
        return result;
    }
}
