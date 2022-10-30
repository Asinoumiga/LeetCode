package com.tello.leetcode.q1to1000.q1to100.q61to70;

public class Leetcode70 {
    public int climbStairs(int n) {
//        if(n==0||n==1){
//            return 1;
//        }
//        return climbStairs(n-2)+climbStairs(n-1);
        int[] num = new int[n+1];
        num[0] = 1;
        num[1] = 1;
        for (int i = 2; i <= n; i++) {
            num[i] = num[i-2]+num[i-1];
        }
        return num[n];
    }
}
