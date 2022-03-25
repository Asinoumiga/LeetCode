package com.tello.tooffer;

public class Offer64 {
    public int sumNums(int n) {
        boolean a = n>0&&(n=sumNums(n-1)+n)>0;
        return n;
    }
}
