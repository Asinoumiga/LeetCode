package com.tello.leecode11to20;

import java.util.HashMap;

//13. 罗马数字转整数
public class LeeCode13 {
	public static int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('A', 4);
		map.put('V', 5);
		map.put('B', 9);
		map.put('X', 10);
		map.put('G', 40);
		map.put('L', 50);
		map.put('H', 90);
		map.put('C', 100);
		map.put('E', 400);
		map.put('D', 500);
		map.put('F', 900);
		map.put('M', 1000);
		s=s.replace("CM", "F");
		s=s.replace("CD", "E");
		s=s.replace("XC", "H");
		s=s.replace("XL", "G");
		s=s.replace("IX", "B");
		s=s.replace("IV", "A");
		System.out.println(s);
		int total = 0;
		char[] sChars = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			total+=map.get(sChars[i]);
		}
		return total;
    }
	
	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}
}
