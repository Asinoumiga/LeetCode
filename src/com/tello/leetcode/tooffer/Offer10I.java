package com.tello.leetcode.tooffer;

import java.util.ArrayList;
import java.util.List;

//剑指 Offer 10- I. 斐波那契数列
public class Offer10I {
    public int fib(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        List<Integer> fibList = new ArrayList<>();
        fibList.add(0);
        fibList.add(1);
        while (fibList.size()-1<n){
            fibList.add((fibList.get(fibList.size()-2)+fibList.get(fibList.size()-1))%1000000007);
        }
        return fibList.get(n);
    }

    public int fib2(int n) {
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return (fib2(n-1)+fib2(n-2)%1000000007);
    }
}
