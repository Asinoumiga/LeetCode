package com.tello;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

//392. еп╤овспРап
public class LeeCode392 {
	 public static boolean isSubsequence(String s, String t) {
		 Queue<Character> queue = new LinkedList<>();
		 char[] a = s.toCharArray();
		 for (int i = 0; i < s.length(); i++) {
			queue.add(a[i]);
		}
		 char[] b = t.toCharArray();
		 int i = 0;
		while (queue.size()>0&&i<t.length()) {
			if(b[i]==queue.peek()) {
				queue.poll();
			}
			i++;
		}
		if(queue.size()>0) {
			return false;
		}
		return true;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(isSubsequence("axc","ahbgdc"));
	}
}
