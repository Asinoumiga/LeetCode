package com.tello.leetcode.q1to1000.q501to600.q551to560;

public class Leetcode557 {
    public String reverseWords(String s) {
        String[] temp = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            StringBuilder tempSb = new StringBuilder();
            sb.append(tempSb.append(temp[i]).reverse()+" ");
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }
}
