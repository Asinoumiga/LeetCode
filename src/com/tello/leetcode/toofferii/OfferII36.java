package com.tello.leetcode.toofferii;

import java.util.Arrays;
import java.util.Stack;

public class OfferII36 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String thisString = tokens[i];
            if(thisString.equals("+")){
                int back = stack.pop();
                int pre = stack.pop();
                stack.push(pre+back);
            }else if(thisString.equals("-")){
                int back = stack.pop();
                int pre = stack.pop();
                stack.push(pre-back);
            }else if(thisString.equals("*")){
                int back = stack.pop();
                int pre = stack.pop();
                stack.push(pre*back);
            }else if(thisString.equals("/")){
                int back = stack.pop();
                int pre = stack.pop();
                stack.push(pre/back);
            }else{
                stack.push(Integer.valueOf(thisString));
            }
        }
        return stack.peek();
    }
}
