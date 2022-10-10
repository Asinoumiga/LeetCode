package com.tello.leetcode.q1001to2000.q1101to1200.q1121to1130;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Leetcode1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] num = new int[100];
        for (int i = 0; i < dominoes.length; i++) {
            int pos;
            if(dominoes[i][0]>dominoes[i][1]){
                pos = dominoes[i][0]*10+dominoes[i][1];
            }else {
                pos = dominoes[i][1]*10+dominoes[i][0];
            }
            num[pos]++;
        }
        int result = 0;
        for (int i = 0; i < num.length; i++) {
            if(num[i]>1){
                System.out.println(num[i]);
                result+=(num[i]-1)*i/2;
            }
        }
        return result;
    }
}
