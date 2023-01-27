package com.tello.leetcode.q1to1000.q301to400.q331to340;

public class Leetcode343 {
    public int integerBreak(int n) {
        int max = n-1;
        for(int i=n/2;i>=2;i--){
            int temp = (int) (Math.pow(i,n/i-n%i)*Math.pow(i+1,n%i));
            System.out.println(i+"  "+temp+"  "+max);
            if(temp>=max){
                max = temp;
            }else {
                break;
            }
        }
        return max;
    }
}
