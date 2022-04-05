package com.tello.tooffer;

import java.util.LinkedList;
import java.util.Stack;

public class Offer31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(popped.length!=pushed.length){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int position = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (stack.size()!=0&&stack.peek()==popped[position]){
                   stack.pop();
                   position++;
            }
        }
        return stack.isEmpty();
    }
}
