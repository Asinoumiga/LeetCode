package com.tello.leetcode.q1to1000.q1to100.q51to60;

public class Leetcode58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int result = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i)==' '){
                break;
            }
            result++;
        }
        return result;
    }
}
