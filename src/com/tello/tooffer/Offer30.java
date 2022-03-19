package com.tello.tooffer;

import java.util.Stack;

public class Offer30 {
    static class MinStack {

        Stack<Integer> stack;
        Stack<Integer> minStack;
        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack();
            minStack = new Stack();
        }

        public void push(int x) {
            stack.push(x);
            if(minStack.isEmpty()||minStack.peek()>=x){
                minStack.push(x);
            }
        }

        public void pop() {
            if(minStack.peek().equals(stack.pop())){
                minStack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int min() {
            return minStack.peek();
        }
    }

    public static void main(String[] args) {
        MinStack a = new MinStack();
        a.push(512);
        a.push(-1024);
        a.push(-1024);
        a.push(512);
        a.pop();
        System.out.println(a.min());
        a.pop();
        System.out.println(a.min());
        a.pop();
        System.out.println(a.min());
    }
}
