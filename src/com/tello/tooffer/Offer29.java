package com.tello.tooffer;

import java.util.ArrayList;
import java.util.List;

public class Offer29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length==0||matrix[0].length==0){
            return new int[0];
        }
        int total = matrix.length*matrix[0].length;
        int[] result = new int[total];
        getResult(result,0,matrix,0,matrix[0].length-1,0, matrix.length-1);
        return result;
    }
    
    public void getResult(int[] result,int now,int[][] matrix,int preX,int backX,int preY,int backY){
        if(backX<preX||backY<preY){
            return;
        }
        for (int i = preX; i <= backX; i++) {
            result[now++]=matrix[preY][i];
        }
        if(preY+1<=backY-1) {
            for (int i = preY+1; i < backY; i++) {
                result[now++] = matrix[i][backX];
            }
        }
        if(preY!=backY) {
            for (int i = backX; i >= preX; i--) {
                result[now++]=matrix[backY][i];
            }
        }
        if(preY+1<=backY-1&&preX!=backX) {
            for (int i = backY-1; i > preY; i--) {
                result[now++] = matrix[i][preX];
            }
        }
        getResult(result,now,matrix,preX+1,backX-1,preY+1, backY-1);
    }
}
