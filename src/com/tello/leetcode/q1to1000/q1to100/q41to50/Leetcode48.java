package com.tello.leetcode.q1to1000.q1to100.q41to50;

public class Leetcode48 {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length/2; i++) {
            for (int j = i; j < matrix[i].length-1-i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-j][i];
                matrix[matrix.length-j][i] = matrix[matrix.length-i][matrix.length-j];
                matrix[matrix.length-i][matrix.length-j] = matrix[j][matrix.length-i];
                matrix[j][matrix.length-i] = temp;
            }
        }
    }
}
