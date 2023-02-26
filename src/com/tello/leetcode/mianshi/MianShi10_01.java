package com.tello.leetcode.mianshi;

public class MianShi10_01 {
    public void merge(int[] A, int m, int[] B, int n) {
        int i=m+n-1;
        m--;
        n--;
        while (m>=0&&n>=0){
            if(A[m]>=B[n]){
                A[i--] = A[m--];
            }else{
                A[i--] = B[n--];
            }
        }
        while (n>=0){
            A[i--] = B[n--];
        }
    }
}
