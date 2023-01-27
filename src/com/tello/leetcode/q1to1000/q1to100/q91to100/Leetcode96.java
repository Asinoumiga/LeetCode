package com.tello.leetcode.q1to1000.q1to100.q91to100;

public class Leetcode96 {
    public int numTrees(int n) {
        int[] result = new int[n+1];
        result[0] = 1;
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                result[i]+=( result[j]*result[i-1-j]);
            }
            System.out.println(result[i]);
        }
        return result[n];
    }
}
