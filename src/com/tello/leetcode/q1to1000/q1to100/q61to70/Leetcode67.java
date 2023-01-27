package com.tello.leetcode.q1to1000.q1to100.q61to70;

public class Leetcode67 {
    public String addBinary(String a, String b) {
        StringBuilder aSb = new StringBuilder(a);
        StringBuilder bSb = new StringBuilder(b);
        aSb.reverse();
        bSb.reverse();
        boolean up = false;
        StringBuilder result = new StringBuilder();
        int now = 0;
        while (now<aSb.length()||now<bSb.length()||up) {
            boolean temp = false;
            if(up){
                temp = true;
                up = false;
            }
            if(now<aSb.length()&&aSb.charAt(now)=='1'){
                if(temp){
                    up =true;
                }
                temp=!temp;
            }
            if(now<bSb.length()&&bSb.charAt(now)=='1'){
                if(temp){
                    up =true;
                }
                temp=!temp;
            }
            if(temp){
                result.append(1);
            }else {
                result.append(0);
            }
            now++;
        }
        return result.reverse().toString();
    }


}
