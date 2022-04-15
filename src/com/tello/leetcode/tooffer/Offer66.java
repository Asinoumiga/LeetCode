package com.tello.leetcode.tooffer;

public class Offer66 {
    public int[] constructArr(int[] a) {
        int[] left = new int[a.length];
        int[] right = new int[a.length];
        int[] result = new int[a.length];
        if(a.length==0){
            return result;
        }else if(a.length==1){
            result[0]=1;
            return result;
        }
        left[0] = a[0];
        right[a.length-1] = a[a.length-1];
        for (int i = 1,j=a.length-2; i < a.length; i++,j--) {
            left[i] = left[i-1] * a[i];
            right[j] = right[j+1] *a[j];
        }
        result[0] = right[1];
        result[a.length-1] = left[a.length-2];
        for (int i = 1; i < a.length-1; i++) {
            result[i] = left[i-1] * right[i+1];
        }
        return result;
    }
}
