package com.tello.leetcode.q1to1000.q101to200.q151to160;

import java.util.Deque;
import java.util.LinkedList;

public class Leetcode155 {
    Deque<Integer> cache;
    Deque<Integer> minCache;
    public Leetcode155() {
        cache = new LinkedList<>();
        minCache = new LinkedList<>();
    }

    public void push(int val) {
        cache.push(val);
        if(minCache.isEmpty()||minCache.peek()>=val){
            minCache.push(val);
        }
    }

    public void pop() {
        int val = cache.pop();
        if(minCache.peek()==val){
            minCache.pop();
        }
    }

    public int top() {
        return cache.peek();
    }

    public int getMin() {
        return minCache.peek();
    }
}
