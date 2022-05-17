package com.tello.leetcode.q1to1000.q401to500.q401to410;

public class Leetcode507 {
    public boolean checkPerfectNumber(int num) {
        if(num ==0){
            return false;
        }
        int result = num-1;
        for (int i = 2; i <= Math.pow(num,0.5); i++) {
            if(num%i==0){
                result-=i;
                result-=num/i;
            }
        }
        if(result==0){
            return true;
        }
        return false;
    }
}
