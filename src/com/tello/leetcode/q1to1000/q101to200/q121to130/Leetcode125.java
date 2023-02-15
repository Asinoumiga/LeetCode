package com.tello.leetcode.q1to1000.q101to200.q121to130;

public class Leetcode125 {
    public boolean isPalindrome(String s) {
        char[] temp = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]>='A'&&temp[i]<='Z'){
                sb.append((char)(temp[i]+32));
            }else if(temp[i]>='a'&&temp[i]<='z'||temp[i]>='0'&&temp[i]<='9'){
                sb.append(temp[i]);
            }
        }
        System.out.println(sb.toString());
        return sb.toString().equals(sb.reverse().toString());
    }
}
