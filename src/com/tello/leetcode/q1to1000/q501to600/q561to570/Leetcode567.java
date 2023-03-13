package com.tello.leetcode.q1to1000.q501to600.q561to570;

public class Leetcode567 {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] tempList = new int[26];
        char[] s1temp = s1.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            tempList[s1temp[i]-'a']++;
        }
        char[] s2temp = s2.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            tempList[s2temp[i]-'a']--;
        }
        for (int i = s1.length(); i < s2.length(); i++) {
            if(checkFit(tempList)){
                return true;
            }
            tempList[s2temp[i-s1.length()]-'a']++;
            tempList[s2temp[i]-'a']--;
        }
        return checkFit(tempList);
    }

    boolean checkFit(int[] temp){
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]!=0){
                return false;
            }
        }
        return true;
    }
}
