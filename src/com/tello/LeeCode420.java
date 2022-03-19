package com.tello;

//420. Ç¿ÃÜÂë¼ìÑéÆ÷
public class LeeCode420 {
	public int strongPasswordChecker(String password) {
		return 0;
    }
	
	public int checkOne(String password) {
		int need = 0;
		if(password.length()<6) {
			need =  6-password.length();
		}else if(password.length()>20) {
			need = password.length()-20;
		}
		return  need;
	}
	
	public int checkTwoAndThree(String password) {
		int two = 0;
		int three = 0;
		boolean lowerCase = false;
		boolean upperCase = false;
		boolean number = false;
		char[] passChar = password.toCharArray();
		for(int i=0;i<password.length();i++) {
			if(passChar[i]<=48&&passChar[i]<=57) {
				number  = true;
			}
		}
		return  0;
	}
}
