package com.tello.leetcode.q1to1000.q101to200.q111to120;

import java.util.ArrayList;
import java.util.List;

public class Leetcode118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        result.add(temp);
        for (int i = 2; i <= numRows; i++) {
            List<Integer> temp2 = result.get(result.size()-1);
            temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < temp2.size(); j++) {
                temp.add(temp2.get(i-1)+temp2.get(i));
            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }
}
