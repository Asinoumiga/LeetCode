package com.tello.leetcode.q1to1000.q201to300.q221to230;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode225 {
    Queue<Integer> cache;
    int top;

    public Leetcode225() {
        cache = new LinkedList<>();
        top = -1;
    }

    public void push(int x) {
        cache.offer(x);
        top = x;
    }

    public int pop() {
        if(cache.size()==0){
            return -1;
        }
        for (int i = 0; i < cache.size()-1; i++) {
            top = cache.peek();
            cache.offer(cache.poll());
        }
        return cache.poll();
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return cache.isEmpty();
    }
}
