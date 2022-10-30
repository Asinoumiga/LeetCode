package com.tello.leetcode.q1to1000.q301to400.q381to390;

import java.util.HashMap;
import java.util.Map;

public class Leetcode383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charList = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            charList[magazine.charAt(i)-'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(charList[ransomNote.charAt(i)-'a']>0){
                charList[ransomNote.charAt(i)-'a']--;
            }else{
                return false;
            }
        }
        return true;
    }
}
