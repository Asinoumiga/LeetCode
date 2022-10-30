package com.tello.leetcode.q1to1000.q201to300.q271to280;

public class Leetcode279 {
    public int numSquares(int n) {
        int[] result = new int[n+1];
        result[0]=0;
        result[1]=1;
        for(int i=1;i<=n;i++){
            int num = 1000;
            for(int j=1;j*j<=i;j++){
                num = Integer.min(num,result[i-j*j]+1);
            }
            result[i] = num;
        }
        return result[n];
    }
}
