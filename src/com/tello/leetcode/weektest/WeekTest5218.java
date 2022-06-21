package com.tello.leetcode.weektest;

public class WeekTest5218 {
    public int minimumNumbers(int num, int k) {
        if(num==0){
            return 0;
        }
        for (int i = 0; i < 10; i++) {
            num -=k;
            if(num>=0&&num%10==0){
                return i;
            }else if(num<0){
                return -1;
            }
        }
        return -1;
    }
}
