package com.tello.leetcode.q1to1000.q201to300.q211to220;

import java.util.ArrayList;
import java.util.List;

public class Leetcode214 {
    public String shortestPalindrome(String s) {
        String tmp = new StringBuilder(s).reverse().append("#").append(s).toString();
        List<Integer> nextList = getNext(tmp);
        String result = new StringBuilder(s.substring(nextList.get(nextList.size()-1))).reverse().toString()+s;
        return result;
    }

    List<Integer> getNext(String s){
        List<Integer> numList = new ArrayList<>();
        numList.add(0);
        int pre = 0;
        for (int i = 1; i < s.length(); i++) {
            while (pre!=0&&s.charAt(pre)!=s.charAt(i)){
                pre = numList.get(pre-1);
            }
            if(s.charAt(pre)==s.charAt(i)){
                pre++;
            }
            numList.add(pre);
        }
        return numList;
    }

}
