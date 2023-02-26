package com.tello.leetcode.q1to1000.q101to200.q131to140;

import java.util.*;

public class Leetcode139 {
        public boolean wordBreak(String s, List<String> wordDict) {
            Map<Integer,List<String>> lengthCache = new HashMap<>();
            boolean[] result = new boolean[s.length()+1];
            result[0] = true;
            int min=100;
            for (int i = 0; i < wordDict.size(); i++) {
                String temp = wordDict.get(i);
                List<String> cache = lengthCache.getOrDefault(temp.length(),new ArrayList<>());
                cache.add(temp);
                lengthCache.put(temp.length(),cache);
                if(min>temp.length()){
                    min = temp.length();
                }
            }
            for (int i = min; i < result.length; i++) {
                for (Integer length: lengthCache.keySet()){
                    if(i-length>=0&&result[i-length]) {
                        List<String> cache = lengthCache.get(length);
                        String temp = s.substring(i-length, i+1);
                        if (cache.contains(temp)) {
                            result[i] = true;
                        }
                    }
                }
            }
            return result[result.length-1];
        }
//    public boolean wordBreak(String s, List<String> wordDict) {
//        Map<Integer,List<String>> lengthCache = new HashMap<>();
//        for (int i = 0; i < wordDict.size(); i++) {
//            String temp = wordDict.get(i);
//            List<String> cache = lengthCache.getOrDefault(temp.length(),new ArrayList<>());
//            cache.add(temp);
//            lengthCache.put(temp.length(),cache);
//        }
//        return intoWord(s,0,lengthCache);
//    }
//
//    public boolean intoWord(String s,int now,Map<Integer,List<String>> lengthCache){
//        if(now == s.length()){
//            return true;
//        }
//        for (int i = now; i < s.length(); i++) {
//            int length = i-now+1;
//            if(lengthCache.containsKey(length)){
//                List<String> cache = lengthCache.get(length);
//                String temp = s.substring(now,i+1);
//                if(cache.contains(temp)&&intoWord(s,i+1,lengthCache)){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
}
