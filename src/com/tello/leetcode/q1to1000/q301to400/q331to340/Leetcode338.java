package com.tello.leetcode.q1to1000.q301to400.q331to340;

public class Leetcode338 {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        int preIndex = 0;
        int pre = 1;
        int backIndex = 1;
        int back = 2;
        while(n>=pre){
            for (int i = pre; i < back; i++) {
                if(i>n){
                    break;
                }
                result[i] = result[i-pre]+1;
            }
            pre = (int)Math.pow(2,preIndex++);
            back = (int)Math.pow(2,backIndex++);
        }
        return result;
    }
}
