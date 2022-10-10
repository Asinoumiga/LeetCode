package com.tello.leetcode.toofferii;

import java.util.List;

public class OfferII4 {
    public int singleNumber(int[] nums) {
//        int[] result = new int[32];
//        int negative = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int num = nums[i];
//            if(num<0){
//                negative = (negative+1)%3;
//                num = -num;
//            }
//            if(num<0){}
//            int j = 0;
//            while (num>0){
//                result[j] = (result[j]+num%2)%3;
//                j++;
//                num/=2;
//            }
//        }
//        int resultNum = 0;
//        for (int i = 0; i < result.length; i++) {
//            resultNum += result[i]*Math.pow(2,i);
//        }
//        return (int)Math.pow(-1,negative)*resultNum;

        int[] arr=new int[32];
        for(int num:nums){
            for(int i=0;i<32;i++){
                arr[i]+=(num>>(31-i))&1;
            }
        }
        int res=0;
        for(int i=0;i<32;i++){
            res=(res<<1)+arr[i]%3;
        }
        return res;
    }
}
