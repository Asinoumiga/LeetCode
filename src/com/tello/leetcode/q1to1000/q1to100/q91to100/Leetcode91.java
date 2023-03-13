package com.tello.leetcode.q1to1000.q1to100.q91to100;

import java.util.List;

public class Leetcode91 {
        public int numDecodings(String s) {
            int[] result = new int[s.length()+2];
            result[0] = 0;
            result[1] = 1;
            for (int i = 2; i < result.length; i++) {
                char now = s.charAt(i-2);
                if(i>=3&&s.charAt(i-3)!='0'&&(s.charAt(i-3)-'0')*10+now-'0'<=26){
                    result[i]+=result[i-2];
                }
                if(now!='0'){
                    result[i]+=result[i-1];
                }
            }
            return result[result.length-1];
        }
//    int result = 0;
//    public int numDecodings(String s) {
//        intoDecodings(s.toCharArray(),0);
//        return result;
//    }
//
//    void intoDecodings(char[] s, int num){
//        if(num>=s.length){
//            result++;
//            return;
//        }
//        if(s[num]=='0'){
//            return;
//        }
//        if(num+1<s.length&&new Integer(""+s[num]+s[num+1])<=26){
//            intoDecodings(s,num+2);
//        }
//        intoDecodings(s,num+1);
//    }
}
