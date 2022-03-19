package com.tello;

import java.util.Iterator;

//5. 最长回文子串
public class LeeCode5 {
	public static String longestPalindrome(String s) {
		
		int position = 0;
		int len = 1;
		if(s.length()==1) {
			return s;
		}
		boolean[][] a  = new boolean[s.length()][s.length()];
		
		for (int i = 0; i < a.length; i++) {
			a[i][i]=true;
		}
		
		char[] sChar = s.toCharArray();
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if(sChar[i]!=sChar[j]) {
					a[i][j]=false;
				}else {
					if(i-j<=2) {
						a[i][j]=true;
					}else {
						a[i][j]=a[i-1][j+1];
					}
				}
				
				if(a[i][j]&&len<i-j+1) {
					position = j;
					len = i-j+1;
				}
			}
		}
		return s.substring(position,position+len);
    }
	
	public static void main(String[] args) {
		String a = "aacabdkacaa";
		System.out.println(longestPalindrome(a));
		
	}
}
