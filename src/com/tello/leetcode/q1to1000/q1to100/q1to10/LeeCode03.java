package com.tello.leetcode.q1to1000.q1to100.q1to10;

//3. 无重复字符的最长子串
public class LeeCode03 {
	public static int lengthOfLongestSubstring(String s) {
		if(s.length()<2) {
			return s.length();
		}
		char[] charList = s.toCharArray();
		int maxLength = 0;
		int pre = 0;
		int back = 1;
		while (back<charList.length) {
			for (int i = pre; i < back; i++) {
				if(charList[i]==charList[back]) {
					pre = i+1;
					break;
				}
			}
			if(back-pre+1>maxLength) {
				maxLength = back-pre+1;
			}
			back++;
		}
		return maxLength;
    }
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkewasfjapfsjgas"));
	}
}
