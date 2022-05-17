package com.tello.leetcode.q1to1000.q801to900.q841to850;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Leetcode847 {
    class Point{
        int num;
        int[][] nowGraph;
        Point(int num,int[][] nowGraph){
            this.num = num;
            this.nowGraph = nowGraph;
        }
    }

    public int shortestPathLength(int[][] graph) {
        Queue<Integer> queue = new PriorityQueue();
        for (int i = 0; i < graph.length; i++) {
            int now = i;
            Queue<Point> a = new LinkedList<>();
            a.add(new Point(i,graph));
            while (!a.isEmpty()){
                Point to = a.poll();

            }

        }
        return 0;
    }
}
