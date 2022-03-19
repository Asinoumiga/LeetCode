package com.tello.leecode11to20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

//17. 电话号码的字母组合
public class LeeCode17 {
	public static List<String> letterCombinations(String digits) {
		char[] numList = digits.toCharArray();
		List<String> result = new ArrayList<>();
		for (int i = 0; i < numList.length; i++) {
			int num = Integer.valueOf(numList[i])-'0';
			System.out.println(num);
			result = getResultList(result, num);
		}
		return result;
		
    }
	public static List<String> getResultList(List<String> result,int num) {
		String[] wordList = getWordList(num);
		if(result.size()<1) {
			return Arrays.asList(wordList);
		}
		List<String> response = new ArrayList<>();
		for (int i = 0; i < wordList.length; i++) {
			for (int j = 0; j < result.size(); j++) {
				System.out.println(wordList[i]+result.get(j));
				response.add(wordList[i]+result.get(j));
			}
		}
		return response;
	}
	
	public static String[] getWordList(int num) {
		switch (num) {
			case 2: {
				return new String[]{"a","b","c"};
			}
			case 3: {
				return new String[]{"d","e","f"};
			}
			case 4: {
				return new String[]{"g","h","i"};
			}
			case 5: {
				return new String[]{"j","k","l"};
			}
			case 6: {
				return new String[]{"m","n","o"};
			}
			case 7: {
				return new String[]{"p","q","r","s"};
			}
			case 8: {
				return new String[]{"t","u","v"};
			}
			case 9: {
				return new String[]{"w","x","y","z"};
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		List<String> a = letterCombinations("23");
		for (String string : a) {
			System.out.println(a);
		}
 	}
}
