package com.tello.leetcode.tooffer;

public class Offer44 {
    public int findNthDigit(int n) {
        if(n<10){
            return n;
        }
        int a = 1;
        long b = (long)Math.pow(10,a)*a;
        while (n>b) {
            n -= b;
            a++;
            b = (long)Math.pow(10,a-1)*9*a;
        }
        long result = (long)Math.pow(10,a-1)+n/a;
        int pos = n%a;
        return String.valueOf(result).charAt(pos)-'0';
    }
}
