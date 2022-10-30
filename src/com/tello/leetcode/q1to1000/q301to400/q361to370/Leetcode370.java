package com.tello.leetcode.q1to1000.q301to400.q361to370;

public class Leetcode370 {
    public int[] getModifiedArray(int length, int[][] updates) {
//±©Á¦£º
//        int[] result = new int[length];
//        for (int i = 0; i < updates.length; i++) {
//            for (int j = updates[i][0]; j <= updates[i][1]; j++) {
//                result[j]+=updates[i][2];
//            }
//        }
//        return result;

        int[] numList = new int[length];
        for (int i = 0; i < updates.length; i++) {
            numList[updates[i][0]] += updates[i][2];
            if(updates[i][1]<length-1){
                numList[updates[i][1]+1] -= updates[i][2];
            }
        }
        for (int i = 1; i < length; i++) {
            numList[i] += numList[i-1];
        }
        return numList;
    }
}
