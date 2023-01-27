package com.tello.leetcode.q1to1000.q1to100.q21to30;

public class Leetcode28 {
    public int strStr(String haystack, String needle) {
        int[] indexList = new int[needle.length()];
        char[] needleList = needle.toCharArray();
        getIndex(indexList,needleList);
        int matchNum = 0;
        for (int i = 0; i < haystack.length();i++) {
            if(haystack.charAt(i)==needleList[matchNum]){
                matchNum++;
                if(matchNum==needle.length()){
                    return i-matchNum+1;
                }
            }else{
                while (matchNum!=0&&haystack.charAt(i)!=needleList[matchNum]){
                    matchNum = indexList[matchNum];
                }
            }
        }
        return -1;
    }

    public void getIndex(int[] indexList,char[] needle){
        int pre = 0;
        int back = 1;
        while (back<needle.length){
            while (pre!=0&&needle[back]!=needle[pre]){pre = indexList[pre-1];}
            if(needle[back]==needle[pre]){
                pre++;
            }
            indexList[back++] = pre;
        }
    }
}
