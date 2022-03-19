package com.tello.tooffer;

import java.util.Arrays;

//剑指 Offer 04. 二维数组中的查找
public class Offer04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0){
            return false;
        }
        int x = matrix[0].length;
        int y = 0;
        while (y< matrix.length&&x>0){
            if(matrix[y][x]>target){
                x--;
            }else if(matrix[y][x]<target){
                y++;
            }else if(matrix[y][x]==target){
                return true;
            }
        }
        return false;
    }

//    public int binarySearch(int[] numList,int target,boolean needBack){
//        int pre = 0;
//        int back = numList.length-1;
//        while (pre<back){
//            int mid = (pre+back)/2;
//            if(numList[mid]>target){
//                back = mid-1;
//            }else if(numList[mid]<target){
//                pre = mid+1;
//            }else {
//                return mid;
//            }
//        }
//        if(needBack){
//            return back;
//        }else{
//            return pre;
//        }
//    }

}
