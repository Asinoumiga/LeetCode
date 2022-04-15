package com.tello.leetcode.q1to1000.q1to100.q1to10;

public class LeeCode06 {
	public static String convert(String s, int numRows) {
		if(numRows == 1) {
			return s;
		}
		char[] sChars = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<numRows;i++) {
			for (int j = 0; i+(2*numRows-2)*j<s.length(); j++) {
				if(i+(2*numRows-2)*j<s.length()) {
					System.out.println(sChars[i+(2*numRows-2)*j]);
					sb.append(sChars[i+(2*numRows-2)*j]);
				}
				if(i!=0&&i!=numRows-1) {
					if((2*numRows-2)*(j+1)-i<s.length()) {
						System.out.println(sChars[(2*numRows-2)*(j+1)-i]);
						sb.append(sChars[(2*numRows-2)*(j+1)-i]);
					}
				}
			}

		}
		return sb.toString();
    }
	
	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
//		String s = "PINASYHPIARLI";
//		String s = "PINALSIGYAHRPI";
		System.out.println(convert(s,4));
	}
}
