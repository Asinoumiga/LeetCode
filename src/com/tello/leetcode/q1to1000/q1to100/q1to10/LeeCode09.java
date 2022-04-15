package com.tello.leetcode.q1to1000.q1to100.q1to10;

public class LeeCode09 {
	public boolean isPalindrome(int x) {
		if(x<0){
            return false;
        }
        int reverNum = 0;
		while(x>reverNum) {
			reverNum = reverNum*10+x%10;
			x=x/10;
		}
		if(x==reverNum||x==reverNum/10) {
			return true;
		}
		return false;

    }
}
