package com.tello.leetcode.tooffer;

//½£Ö¸ Offer 58 - I. ·­×ªµ¥´ÊË³Ðò
public class Offer58I {
    public String reverseWords(String s) {
        String[] charList = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = charList.length-1; i >= 0; i--) {
            if(charList[i]!=""){
                sb.append(charList[i]+" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "abc   c a";
        String[] charList = s.split(" ");
        for (int i = 0; i < charList.length; i++) {
            System.out.println(charList[i]);
        }
    }
}
