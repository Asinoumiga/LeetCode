package com.tello.leetcode.q1to1000.q301to400.q331to340;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode340 {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
//        Map<Character, List<Integer>> stringMap = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            List<Integer> posList = stringMap.getOrDefault(s.charAt(i),new ArrayList<>());
//            posList.add(i);
//            stringMap.put(s.charAt(i),posList);
//        }
//        int pre = 0;
//        int back = 1;
//        int max = 1;
//        while (back<s.length()){
//            if(s.charAt(back))
//        }
        if(k==0){
            return 0;
        }
        Map<Character,Integer> charNumList = new HashMap<>();
        //pre 和 back 记录滑动窗口前后
        int pre = 0;
        int back = 0;
        //max记录最大字符串长度
        int max = 0;
        //charNum 记录字符串字符个数
        int charNum = 0;
        while (back<s.length()){
            int been = charNumList.getOrDefault(s.charAt(back),0);
            if(been==0){
                charNum++;
            }
            been++;
            charNumList.put(s.charAt(back),been);
            while (charNum>k){
                int num = charNumList.get(s.charAt(pre));
                num--;
                charNumList.put(s.charAt(pre),num);
                if(num==0){
                    charNum--;
                }
                pre++;
            }
            if(back-pre+1>max){
                max = back-pre+1;
            }
            back++;
        }
        return max;
    }
}
