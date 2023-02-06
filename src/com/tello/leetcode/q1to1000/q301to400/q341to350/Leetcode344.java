package com.tello.leetcode.q1to1000.q301to400.q341to350;

public class Leetcode344 {
    public void reverseString(char[] s) {
        int pre=0;
        int back = s.length-1;
        while (pre<back){
            char temp = s[pre];
            s[pre++] = s[back];
            s[back--] = temp;
        }
    }
}
