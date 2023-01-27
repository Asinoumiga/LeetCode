package com.tello.leetcode.q1to1000.q1to100.q41to50;

public class Leetcode43 {
    public String multiply(String num1, String num2) {
        int[] resultList = new int[num1.length()+num2.length()+2];
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        for (int i = 0; i < num2.length(); i++) {
            int down = num2.charAt(i)-'0';
            for (int j = 0; j < num1.length(); j++) {
                int up = num1.charAt(j)-'0';
                resultList[i+j]+=down*up;
            }
        }
        for (int i = 0; i < resultList.length-1; i++) {
            resultList[i+1] += resultList[i]/10;
            resultList[i] = resultList[i]%10;
        }
        StringBuilder result = new StringBuilder();
        int i = resultList.length-1;
        while (i>0&&resultList[i]==0){
            i--;
        }
        for (; i >=0 ; i--) {
            result.append(resultList[i]);
        }
        return result.toString();
    }
}
