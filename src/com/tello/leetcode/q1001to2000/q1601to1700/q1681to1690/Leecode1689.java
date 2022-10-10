package com.tello.leetcode.q1001to2000.q1601to1700.q1681to1690;

public class Leecode1689 {
    public int minPartitions(String n) {
        int result = '0';
        for(int i = 0;i<n.length();i++){
            if(n.charAt(i)>result){
                if(n.charAt(i)==9){
                    return 9;
                }else{
                    result = n.charAt(i);
                }
            }
        }
        return result-'0';
    }
}
