package com.tello.leetcode.toofferii;

public class OfferII2 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int aPos = a.length()-1;
        int bPos = b.length()-1;
        int num = 0;
        while (aPos>=0||bPos>=0||num!=0){
            if(aPos>=0){
                num+=a.charAt(aPos--)-'0';
            }
            if(bPos>=0){
                num+=b.charAt(bPos--)-'0';
            }
            sb.append(num%2);
            num = num/2;
        }
        return sb.reverse().toString();
    }
}
