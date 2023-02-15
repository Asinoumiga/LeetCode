package com.tello.leetcode.q1to1000.q101to200.q151to160;

public class Leetcode151 {
    public String reverseWords(String s) {
        char[] temp = (" "+s.trim()).toCharArray();
        StringBuilder result = new StringBuilder();
        int pre = temp.length-1;
        int back = temp.length-1;
        while (pre>=0) {
            if(temp[pre]==' '){
                for (int i = pre; i <= back; i++) {
                    result.append(temp[i]);
                }
                result.append(" ");
                while (pre>=0&&temp[pre]==' '){
                    pre--;
                }
            }else{
                back = pre;
                while (pre>=0&&temp[pre]!=' '){
                    pre--;
                }
            }
        }
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
}
