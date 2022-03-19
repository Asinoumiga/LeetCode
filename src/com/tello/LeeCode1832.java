package com.tello;

import java.util.HashMap;
import java.util.HashSet;

//1832. 判断句子是否为全字母句
public class LeeCode1832 {
	public boolean checkIfPangram(String sentence) {
		
		if(sentence.length()<26) {
			return false;
		}
		char[] a = sentence.toCharArray();
		HashSet<Character> aChars = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			aChars.add(a[i]);
		}
		
		if(aChars.size()==26) {
			return true;
		}
		return false;
    }
}
