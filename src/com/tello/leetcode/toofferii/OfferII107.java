package com.tello.leetcode.toofferii;

public class OfferII107 {
    public int[][] updateMatrix(int[][] mat) {
        int[][] result = mat.clone();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(result[i][j]==1){
                    result[i][j] = Integer.MAX_VALUE/2;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                if(i>0){
                    result[i][j] = Math.min(result[i-1][j]+1,result[i][j]);
                }
                if(j>0){
                    result[i][j] = Math.min(result[i][j-1]+1,result[i][j]);
                }
            }
        }
        for (int i = result.length-1; i >=0; i--) {
            for (int j = result[0].length-1; j >=0; j--) {
                System.out.println(i+" "+j);
                if(i<result.length-1){
                    result[i][j] = Math.min(result[i+1][j]+1,result[i][j]);
                }
                if(j<result.length-1){
                    result[i][j] = Math.min(result[i][j+1]+1,result[i][j]);
                }
            }
        }
        return result;
    }
}
