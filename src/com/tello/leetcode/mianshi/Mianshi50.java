package com.tello.leetcode.mianshi;

import java.util.*;

public class Mianshi50 {
    public char firstUniqChar(String s) {
        if(s.length()==0){
            return ' ';
        }
        int[] sList = new int[26];
        List<Character> a = new ArrayList<>();
        char[] sChars = s.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            sList[sChars[i]-'a']++;
        }
        for (int i = 0; i < sChars.length; i++) {
            if(sList[sChars[i]-'a']==1){
                return sChars[i];
            }
        }
        return ' ';
    }
}
