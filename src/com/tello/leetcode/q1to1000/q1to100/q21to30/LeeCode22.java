package com.tello.leetcode.q1to1000.q1to100.q21to30;

import java.util.ArrayList;
import java.util.List;

//22. À¨ºÅÉú³É
public class LeeCode22 {
	static List<String> res = new ArrayList<>();
    public static List<String> generateParenthesis(int n) {
        if(n <= 0){
            return res;
        }
        getParenthesis("",n,n);
        return res;
    }

    private static void getParenthesis(String str,int left, int right) {
        if(left == 0 && right == 0 ){
            res.add(str);
            return;
        }
        if(left == right){
            getParenthesis(str+"(",left-1,right);
        }else if(left < right){
            if(left > 0){
                getParenthesis(str+"(",left-1,right);
            }
            getParenthesis(str+")",left,right-1);
        }
    }
	
	public static void main(String[] args) {
		List<String> parList = generateParenthesis(3);
		for (String string : parList) {
			System.out.println(string);
		}
	}
}
