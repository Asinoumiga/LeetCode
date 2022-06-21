package com.tello.leetcode.weektest;

public class WeekTest6099 {
    public int longestSubsequence(String s, int k) {
        String kString = Integer.toBinaryString(k);
        int mid = s.length()-kString.length()<0?0:s.length()-kString.length();
        int result = 0;
        for (int i = 0; i < mid; i++) {
            if(s.charAt(i)=='0'){
                result++;
            }
        }
        if(Integer.valueOf(s.substring(mid,s.length()),2)>k){
            result+=s.length()-mid-1;
        }else{
            result+=s.length()-mid;
        }
        return result;
    }
}
