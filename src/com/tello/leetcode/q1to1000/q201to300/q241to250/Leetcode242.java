package com.tello.leetcode.q1to1000.q201to300.q241to250;

import java.util.Arrays;

public class Leetcode242 {
//    public boolean isAnagram(String s, String t) {
//        if(s.length()!=t.length()){
//            return false;
//        }
//        int[] temp = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            temp[s.charAt(i)-'a']++;
//            temp[t.charAt(i)-'a']--;
//        }
//        for (int i = 0; i < temp.length; i++) {
//            if(temp[i]!=0){
//                return false;
//            }
//        }
//        return true;
//    }
public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()){
        return false;
    }
    char[] temp = s.toCharArray();
    char[] temp2 = t.toCharArray();
    Arrays.sort(temp);
    Arrays.sort(temp2);
    return Arrays.equals(temp,temp2);
}
}
