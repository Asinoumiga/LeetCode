package com.tello.leetcode.q1to1000.q1to100.q1to10;

public class Leetcode08 {
    public int myAtoi(String s) {
        int startIndex= 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                startIndex++;
            }else{
                break;
            }
        }
        if(startIndex==s.length()){
            return 0;
        }
        int sign = 1;
        if(s.charAt(startIndex)=='-'){
            sign = -1;
            startIndex++;
        }else if(s.charAt(startIndex)=='+'){
            startIndex++;
        }
        int result=0;

        for (; startIndex < s.length(); startIndex++) {
            char temp = s.charAt(startIndex);
            if(temp>'9'||temp<'0'){
                break;
            }
            if(sign==1){
                if(result<Integer.MAX_VALUE/10||(result==Integer.MAX_VALUE/10&&temp<=Integer.MAX_VALUE%10+'0')) {
                    result =result*10+temp-'0';
                }else{
                    return Integer.MAX_VALUE;
                }
            }else if(sign==-1) {
                if(result>Integer.MIN_VALUE/10||(result==Integer.MIN_VALUE/10&&temp-'0'<=-(Integer.MIN_VALUE%10))) {
                    result =result*10-temp+'0';
                }else{
                    return Integer.MIN_VALUE;
                }
            }
        }
        return result;
    }
}
