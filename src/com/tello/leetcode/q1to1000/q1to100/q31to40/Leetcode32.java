package com.tello.leetcode.q1to1000.q1to100.q31to40;

import java.util.Deque;
import java.util.LinkedList;

public class Leetcode32 {
    public int longestValidParentheses(String s) {
        if(s.length()<2){
            return 0;
        }
        Deque<Integer> deque = new LinkedList<>();
        boolean[] cache = new boolean[s.length()];
        char[] temp = s.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]=='('){
                deque.push(i);
            }
            if(temp[i]==')'&&!deque.isEmpty()){
                cache[i]=true;
                cache[deque.pop()]=true;
            }
        }
        int result = 0;
        int flag = 0;
        for (int i = 0; i < cache.length; i++) {
            if(cache[i]){
                flag++;
            }else if(result<flag) {
                result = flag;
                flag = 0;
            }else {
                flag = 0;
            }
        }
        return Math.max(flag,result);
    }
}
