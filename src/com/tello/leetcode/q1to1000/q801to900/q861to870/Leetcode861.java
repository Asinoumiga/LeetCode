package com.tello.leetcode.q1to1000.q801to900.q861to870;

public class Leetcode861 {
    public int matrixScore(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if(grid[i][0]==0){
                for (int j = 0; j < grid[i].length; j++) {
                    grid[i][j] = 1-grid[i][j];
                }
            }
        }
        int zero;
        for (int i = 1; i < grid[0].length; i++) {
            zero = 0;
            for (int j = 0; j < grid.length; j++) {
                if(grid[j][i]==0){
                    zero++;
                }
            }
            if(zero>grid.length/2){
                for (int j = 0; j < grid.length; j++) {
                    grid[j][i] = 1-grid[i][j];
                }
            }
        }
        int num=0;
        for(int j=0;j<grid[0].length;j++) {
            double temp=Math.pow(2,grid[0].length-j-1);
            for (int i=0;i<grid.length;i++){
                num+=grid[i][j]*temp;
            }
        }
        return num;
    }
}
