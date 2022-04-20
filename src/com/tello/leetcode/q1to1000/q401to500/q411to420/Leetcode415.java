package com.tello.leetcode.q1to1000.q401to500.q411to420;

public class Leetcode415 {
    public String addStrings(String num1, String num2) {
        int num1pos = num1.length()-1;
        int num2pos = num2.length()-1;
        int upper = 0;
        StringBuilder sb = new StringBuilder();
        while(num1pos >= 0 || num2pos >= 0 || upper != 0){
            if(num1pos>=0) upper += num1.charAt(num1pos--)-'0';
            if(num2pos>=0) upper += num2.charAt(num2pos--)-'0';
            sb.append(upper%10);
            upper /= 10;
        }
        return sb.reverse().toString();
    }
}
