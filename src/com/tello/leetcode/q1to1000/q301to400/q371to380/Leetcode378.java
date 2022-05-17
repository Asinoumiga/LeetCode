package com.tello.leetcode.q1to1000.q301to400.q371to380;

import java.util.Arrays;

public class Leetcode378 {
    public int kthSmallest(int[][] matrix, int k) {
        int yLength = matrix.length-1;
        int xLength = matrix[0].length-1;
        int pre = matrix[0][0];
        int back  = matrix[yLength][xLength];
        int mid;
        while(pre<back){
            mid = (pre + back)>>1;

            if(getBeforeMidNum(matrix,mid)>=k){
                back = mid;
            }else{
                pre = mid + 1;
            }
        }
        return pre;
    }

    int getBeforeMidNum(int[][] matrix,int mid){
        int y = matrix.length-1;
        int x = 0;
        int result = 0;


        while (x<matrix[0].length&&y>=0){
            if(matrix[y][x]<=mid){
                result+= y+1;
                x++;
            }else{
                y--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{1,5,9},{2,8,12},{6,9,15}};
        System.out.println(new Leetcode378().getBeforeMidNum(a,11));
    }
}
