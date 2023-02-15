package com.tello.leetcode.q1to1000.q401to500.q401to410;

public class Leetcode509 {
    public int fib(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        int[] result = new int[n+1];
        result[1]=1;
        for (int i = 2; i <= n; i++) {
            result[i] = result[i-2]+result[i-1];
        }
        return result[n];
    }
//    public int fib(int n) {
//        if(n==0){
//            return 0;
//        }else if(n==1){
//            return 1;
//        }
//        return fib(n-2)+fib(n-1);
//    }
}
