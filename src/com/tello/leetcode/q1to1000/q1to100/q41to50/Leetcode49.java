package com.tello.leetcode.q1to1000.q1to100.q41to50;

import java.util.*;

public class Leetcode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] sort = strs[i].toCharArray();
            Arrays.sort(sort);
            String temp = new String(sort);

            List tempList = map.getOrDefault(temp,new ArrayList<>());
            tempList.add(strs[i]);
            map.put(temp,tempList);
        }
        Set<Map.Entry<String, List<String>>> resultSet = map.entrySet();
        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : resultSet) {
            result.add(entry.getValue());
        }
        return result;
    }
}
