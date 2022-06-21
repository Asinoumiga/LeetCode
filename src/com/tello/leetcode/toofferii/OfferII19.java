package com.tello.leetcode.toofferii;

public class OfferII19 {
    public boolean validPalindrome(String s) {
        char[] list = s.toCharArray();
        for (int i = 0,j = s.length()-1; i < j; i++,j--) {
            if(list[i]!=list[j]){
                return validPa(list,i+1,j)||validPa(list,i,j-1);
            }
        }
        return true;
    }

    public boolean validPa(char[] list,int pre,int back){
        while (pre<back) {
            if(list[pre]!=list[back]){
                return false;
            }
            pre++;
            back--;
        }
        return true;
    }
}
