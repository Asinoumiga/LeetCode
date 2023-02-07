package com.tello.leetcode.q1to1000.q1to100.q71to80;

import java.util.HashMap;
import java.util.Map;

public class Leetcode76 {
    public String minWindow(String s, String t) {
        String result = "";
        if(s.length()<t.length()){
            return result;
        }
        Map<Character,Integer> tMap = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i),0)+1);
        }

        Map<Character, Integer> windowNum = new HashMap<>();
        Integer valid = 0;
        int pre = 0;
        int back = 0;
        while (back<s.length()){
            char backTemp = s.charAt(back++);
            if(tMap.containsKey(backTemp)){
                windowNum.put(backTemp,windowNum.getOrDefault(backTemp,0)+1);
                if(windowNum.get(backTemp).compareTo(tMap.get(backTemp))==0){
                    valid++;
                }
            }
            while (valid.compareTo(tMap.size())==0){
                char preTemp = s.charAt(pre);
                if(tMap.containsKey(preTemp)){
                    windowNum.put(preTemp,windowNum.get(preTemp)-1);
                    if(windowNum.get(preTemp).compareTo(tMap.get(preTemp))<0){
                        System.out.println("pre:"+pre+" back:"+back);
                        if(result.length()==0||back-pre<result.length()){
                            result = s.substring(pre,back);
                        }
                        valid--;
                    }
                }
                pre++;
            }
        }
        return result;
    }
}
