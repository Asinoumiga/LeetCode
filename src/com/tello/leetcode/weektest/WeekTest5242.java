package com.tello.leetcode.weektest;

public class WeekTest5242 {
    public String greatestLetter(String s) {
        boolean[] minList = new boolean[26];
        boolean[] maxList = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(a>='A'&&a<='Z'){
                maxList[a-'A'] = true;
            }else if(a>='a'&&a<='z'){
                minList[a-'a'] = true;
            }
        }
        for (int i = 25; i >=0; i--) {
            if(minList[i]&&maxList[i]){
                return String.valueOf((char)('A'+i));
            }
        }
        return "";
    }
}
