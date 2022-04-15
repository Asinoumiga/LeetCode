package com.tello.leetcode.q1to1000.q1to100.q11to20;

//14. 最长公共前缀
public class LeeCode14 {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) return "";

	    int rows = strs.length;
	    int cols = strs[0].length();
	    for (int i = 0; i < cols; i++) {
	        char firstChar = strs[0].charAt(i);
	        for (int j = 1; j < rows; j++) {
	            if (strs[j].length() == i || strs[j].charAt(i) != firstChar) {
	                return strs[0].substring(0, i);
	            }
	        }
	    }
	    return strs[0];
    }
}
