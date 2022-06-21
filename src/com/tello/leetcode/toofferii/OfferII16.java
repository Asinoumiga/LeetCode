package com.tello.leetcode.toofferii;

public class OfferII16 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2) {
            return s.length();
        }
        char[] charList = s.toCharArray();
        int maxLength = 0;
        int pre = 0;
        int back = 1;
        while (back<charList.length) {
            for (int i = pre; i < back; i++) {
                if(charList[i]==charList[back]) {
                    pre = i+1;
                    break;
                }
            }
            if(back-pre+1>maxLength) {
                maxLength = back-pre+1;
            }
            back++;
        }
        return maxLength;
    }
}
