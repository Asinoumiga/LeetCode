package com.tello.leetcode.q1to1000.q1to100.q51to60;

public class Leetcode59 {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int current = 1,num=n;
        int i=0,j=0;
        while(current<n*n){
            for(int count = 1;count<num;count++){
                result[i][j++] = current++;
            }
            for(int count = 1;count<num;count++){
                result[i++][j] = current++;
            }
            for(int count = 1;count<num;count++){
                result[i][j--] = current++;
            }
            for(int count = 1;count<num;count++){
                result[i--][j] = current++;
            }
            i++;
            j++;
            num-=2;
        }
        if(n%2==1) result[i][j] = current;
        return result;
    }


}
