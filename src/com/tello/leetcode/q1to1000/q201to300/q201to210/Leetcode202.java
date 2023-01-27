package com.tello.leetcode.q1to1000.q201to300.q201to210;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode202 {
    public boolean isHappy(int n) {
        Set<Integer> cache = new HashSet<>();
        int temp;
        while (n!=1){
            temp = 0;
            if(cache.contains(n)){
                return false;
            }else{
                cache.add(n);
            }
            while (n!=0){
                temp+=Math.pow(n%10,2);
                n = n/10;
            }
            n=temp;
        }
        return true;
    }
}
