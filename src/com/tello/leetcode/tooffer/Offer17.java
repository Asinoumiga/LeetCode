package com.tello.leetcode.tooffer;

public class Offer17 {
    public int[] printNumbers(int n) {
        int max = (int) Math.pow(10,n-1);
        int[] result = new int[max-1];
        for (int i = 0; i < max; i++) {
            result[i]= result[i+1];
        }
        return result;
    }
//    public int[] printNumbers(int n) {
//        char[] target = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
//        int[] result = new int[(int)Math.pow(10, n) - 1];
//        char[] a = new char[n];
//        for (int i = 0; i < n-1; i++) {
//            a[i] = '0';
//        }
//        a[n-1] = '1';
//        boolean needUp = false;
//        for (int i = 0; i < result.length; i++) {
//            if(a[n-1]=='9'){
//                needUp = true;
//            }else{
//                a[n-1] = target[(int)a[n-1]+1];
//            }
//            if(needUp){
//                for (int j = n-1; j >=0 ; j--) {
//                    if(a[j]==target[9]){
//                        a[j]=target[0];
//                    }else{
//                        if(needUp){
//                            a[j] = target[(int)a[j]+1];
//
//                        }
//                    }
//                }
//            }
//
//        }
//
//    }
}
