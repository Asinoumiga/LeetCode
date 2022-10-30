package com.tello.leetcode.q1to1000.q1to100.q41to50;

public class Leetcode42 {
    public int trap(int[] height) {
        int result = 0;
        int pre = 0;
        int nowNum = 0;
        //遍历从前往后
        for (int i = 0; i < height.length; i++) {
            if(nowNum<=height[i]){
                while (i-pre>1){
                    pre++;
                    result+=nowNum-height[pre];
                }
                nowNum = height[i];
                pre = i;
            }
        }
        //遍历从后往前，只需要到pre的位置
        int back = 0;
        nowNum = 0;
        for (int i = height.length-1; i >= pre ; i--) {
            if(nowNum<=height[i]){
                while (back-i>1){
                    back--;
                    result+=nowNum-height[back];
                }
                nowNum = height[i];
                back = i;
            }
        }
        return result;
    }
}
