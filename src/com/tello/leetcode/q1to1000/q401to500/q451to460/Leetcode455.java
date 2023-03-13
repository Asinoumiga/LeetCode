package com.tello.leetcode.q1to1000.q401to500.q451to460;

import java.util.Arrays;

public class Leetcode455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gIndex = g.length-1;
        int sIndex = s.length-1;
        int result = 0;
        while (sIndex>=0&&gIndex>=0){
            if(s[sIndex]>=g[gIndex--]){
                result++;
                sIndex--;
            }
        }
        return result;

    }
}
