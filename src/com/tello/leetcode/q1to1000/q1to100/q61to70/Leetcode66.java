package com.tello.leetcode.q1to1000.q1to100.q61to70;

public class Leetcode66 {
    public int[] plusOne(int[] digits) {
        boolean up = true;
        int pos = digits.length-1;
        while (up&&pos>=0) {
            digits[pos]+=1;
            if(digits[pos]>=10){
                digits[pos]-=10;
                pos--;
            }else{
                up = false;
            }
        }
        if(pos==0&&up){
            digits = new int[digits.length+1];
            digits[0] = 1;
        }
        return digits;
    }
}
