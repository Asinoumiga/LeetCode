package com.tello.leetcode.q1to1000.q1to100.q11to20;

import java.util.Stack;

//20. ÓÐÐ§µÄÀ¨ºÅ
public class LeeCode20 {
	public boolean isValid(String s) {
		char[] c = s.toCharArray();
        Stack<Character> a = new Stack<>();
        for (int i = 0; i < c.length; i++) {
			if(c[i]=='(') {
				a.push(')');
			}else if(c[i]=='[') {
				a.push(']');
			}else if(c[i]=='{') {
				a.push('}');
			}else if(a.isEmpty()||c[i]!=a.pop()) {
				return false;
			}
		}
        return a.isEmpty();
    }
}
