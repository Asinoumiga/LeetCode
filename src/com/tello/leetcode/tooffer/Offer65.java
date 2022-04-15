package com.tello.leetcode.tooffer;

public class Offer65 {
    public int add(int a, int b) {
        int c;
        while (b!=0){
            c = (a&b)<<1;
            a ^= b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(3^1);
    }
}
