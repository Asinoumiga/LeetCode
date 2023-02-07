package com.tello.leetcode.q1to1000.q1to100.q31to40;

public class Leetcode38 {
//    public String countAndSay(int n) {
//        String result = "1";
//        for (int i = 1; i < n; i++) {
//            StringBuilder temp = new StringBuilder();
//            char[] pre = result.toCharArray();
//            for (int j = 0; j < result.length(); j++) {
//                int num = 1;
//                while (j+1<pre.length&&pre[j+1]==pre[j]){
//                    j++;
//                    num++;
//                }
//                temp.append(num+""+pre[j]);
//            }
//            result = temp.toString();
//        }
//        return result;
//    }

    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        StringBuilder temp = new StringBuilder();
        char[] pre = countAndSay(n-1).toCharArray();
        for (int j = 0; j < pre.length; j++) {
            int num = 1;
            while (j+1<pre.length&&pre[j+1]==pre[j]){
                j++;
                num++;
            }
            temp.append(num+""+pre[j]);
        }
        return temp.toString();
    }
}
