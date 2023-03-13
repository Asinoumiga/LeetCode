package com.tello.leetcode.q1to1000.q201to300.q231to240;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Leetcode232 {
    Deque<Integer> instack;
    Deque<Integer> outstack;
    public Leetcode232() {
        instack = new LinkedList();
        outstack = new LinkedList();
    }

    public void push(int x) {
        instack.push(x);
    }

    public int pop() {
        if (!outstack.isEmpty()){
            return outstack.pop();
        }
        if (instack.isEmpty()){
            return -1;
        }
        while (!instack.isEmpty()){
            outstack.push(instack.pop());
        }
        return outstack.pop();
    }

    public int peek() {
        if (!outstack.isEmpty()){
            return outstack.peek();
        }
        if (instack.isEmpty()){
            return -1;
        }
        while (!instack.isEmpty()){
            outstack.push(instack.pop());
        }
        return outstack.peek();
    }

    public boolean empty() {
        return instack.isEmpty()&&outstack.isEmpty();
    }
}
