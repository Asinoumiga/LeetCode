package com.tello.leetcode.q1to1000.q201to300.q251to260;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode251 {
    Queue<Integer> numList;

    public Leetcode251(int[][] vec) {
        numList = new LinkedList<>();
        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < vec[i].length; j++) {
                numList.add(vec[i][j]);
            }
        }
    }

    public int next() {
        return numList.poll();
    }

    public boolean hasNext() {
        return !numList.isEmpty();
    }
}
