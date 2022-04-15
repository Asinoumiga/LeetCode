package com.tello.leetcode.q1to1000.q1to100.q1to10;

//½£Ö¸ Offer 05. Ìæ»»¿Õ¸ñ
public class LeeCode05 {
	 public String replaceSpace(String s) {
	     StringBuilder result = new StringBuilder();   
		 for(int i=0;i<s.length();i++){
	            char a=s.charAt(i);
	            if(a== ' ') {
	            	result.append("%20");
	            }else {
	            	result.append(a);
	            }
	        }
	        return result.toString();
	 }
}
