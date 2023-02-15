package com.tello.leetcode.q1to1000.q1to100.q51to60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    // 定义棋盘中的占位符
    public char[] value;
    // 解决N皇后问题的主要函数
    public List<List<String>> solveNQueens(int n) {
        // 用于存储最终结果的二维列表
        List<List<String>> result = new ArrayList<>();
        // 初始化占位符数组
        value = new char[n];
        Arrays.fill(value,'.');
        // 初始化每行是否被占用的数组
        int[] nums = new int[n];
        // 初始化左斜方向上是否被占用的数组
        int[] leftNums = new int[2*n-1];
        // 初始化右斜方向上是否被占用的数组
        int[] rightNums = new int[2*n-1];
        // 调用递归函数求解
        intoQueen(result,new ArrayList<>(),nums,leftNums,rightNums,n);
        // 返回结果
        return result;
    }

    // 递归函数，用于枚举每个位置上是否放置皇后
    public void intoQueen(List<List<String>> result,List<String> temp,int[] nums,int[] leftNums,int[] rightNums,int n){
        int y = temp.size();
        //如果y等于n，表示已经摆完了n个皇后
        if(y==n){
            //将这种摆法放入结果集中
            result.add(new ArrayList<>(temp));
            //返回上一层递归
            return;
        }
        //遍历每一列
        for (int x = 0; x < nums.length; x++) {
            //计算当前坐标(x,y)在左斜方向上的编号
            int leftNum = x+y;
            //计算当前坐标(x,y)在右斜方向上的编号
            int rightNum = -x+y+(n-1);
            //如果这个位置上，在横纵方向以及左右斜方向上都没有放置过皇后
            if(nums[x]==0&&leftNums[leftNum]==0&&rightNums[rightNum]==0) {
                //复制当前字符数组，在当前位置上放置皇后
                char[] val = value.clone();
                val[x] = 'Q';
                //将放置好皇后的新字符数组加入temp列表
                temp.add(new String(val));
                //记录当前位置已经放置过皇后
                nums[x] = 1;
                leftNums[leftNum] = 1;
                rightNums[rightNum] = 1;
                //递归摆放下一个皇后
                intoQueen(result, temp, nums,leftNums,rightNums, n);
                //回溯
                temp.remove(temp.size() - 1);
                nums[x] = 0;
                leftNums[leftNum] = 0;
                rightNums[rightNum] = 0;
            }
        }
    }
}
