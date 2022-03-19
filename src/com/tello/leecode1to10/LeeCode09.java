package com.tello.leecode1to10;

import java.util.Arrays;
import java.util.Iterator;

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
