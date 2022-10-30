package com.tello.leetcode.q1to1000.q301to400.q391to400;

public class Leetcode394 {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                String time = "";
                while (s.charAt(i)>='0'&&s.charAt(i)<='9'){
                    time+=s.charAt(i++);
                }
                int back = i;
                int frondNum = 0;
                while (!(frondNum==1&&s.charAt(back)==']')){
                    if(s.charAt(back)=='['){
                        frondNum++;
                    }else if(s.charAt(back)==']'){
                        frondNum--;
                    }
                    back++;
                }
                String inside = decodeString(s.substring(i+2,back-1));
                for (int j = 0; j < Integer.valueOf(time); j++) {
                    sb.append(inside);
                }
                i = back;
            }
        }
        return sb.toString();
    }
}
