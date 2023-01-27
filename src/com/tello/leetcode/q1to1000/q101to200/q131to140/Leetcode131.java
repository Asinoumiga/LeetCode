package com.tello.leetcode.q1to1000.q101to200.q131to140;

import java.util.ArrayList;
import java.util.List;

public class Leetcode131 {
    List<List<String>> result;
    List<String> data;
    public List<List<String>> partition(String s) {
        result = new ArrayList<>();
        data = new ArrayList<>();
        dfs(s,0);
        return result;
    }

    void dfs(String s,int now){
        if(now==s.length()){
            result.add(new ArrayList<>(data));
            return;
        }
        for (int i = now+1; i <= s.length(); i++) {
            String temp = s.substring(now,i);
            if(checkPart(temp)){
                data.add(temp);
                dfs(s,i);
                data.remove(data.size()-1);
            }
        }
    }
    boolean checkPart(String value){
        int pre = 0;
        int back = value.length()-1;

        while (pre<=back){
            if(value.charAt(pre++)!=value.charAt(back--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Leetcode131().partition("a"));
    }
}
