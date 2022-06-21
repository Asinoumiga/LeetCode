package com.tello.leetcode.toofferii;

//剑指 Offer II 013. 二维子矩阵的和
public class OfferII13 {

    int[][] cache;
    public OfferII13(int[][] matrix) {
        cache = new int[matrix.length][matrix[0].length];
        int value = 0;
        cache[0][0] = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            cache[i][0] = cache[i-1][0] + matrix[i][0];
        }
        for (int i = 1; i < matrix[0].length; i++) {
            cache[0][i] = cache[0][i-1] + matrix[0][i];
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                cache[i][j] = cache[i-1][j]+cache[i][j-1]-cache[i-1][j-1]+matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(row1 == 0&&col1 == 0){
            return cache[row2][col2];
        }else if(row1 == 0){
            return cache[row2][col2]-cache[row2][col1-1];
        }else if(col1 == 0){
            return cache[row2][col2]-cache[row1-1][col2];
        }else{
            return cache[row2][col2]+cache[row1-1][col1-1]-cache[row2][col1-1]-cache[row1-1][col2];
        }
    }
}
