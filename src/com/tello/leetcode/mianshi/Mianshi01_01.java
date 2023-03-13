package com.tello.leetcode.mianshi;

public class Mianshi01_01 {
    public boolean isUnique(String astr) {
        if(astr.length()>26){
            return false;
        }
        boolean[] cache = new boolean[26];
        for (int i = 0; i < astr.length(); i++) {
            if(cache[astr.charAt(i)-'a']){
                return false;
            }
            cache[astr.charAt(i)-'a'] = true;
        }
        return true;
    }
}
