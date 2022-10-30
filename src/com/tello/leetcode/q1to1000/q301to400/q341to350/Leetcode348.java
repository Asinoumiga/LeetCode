package com.tello.leetcode.q1to1000.q301to400.q341to350;

public class Leetcode348 {
    int n;
    int[] yWinList;
    int[] xWinList;
    int a,b;
    public Leetcode348(int n) {
        this.n = n;
        xWinList = new int[n];
        yWinList = new int[n];
        a=0;
        b=0;
    }

    public int move(int row, int col, int player) {
        int num = 2*player-3;
        xWinList[row] = xWinList[row] + num;
        yWinList[col] = yWinList[col] + num;
        System.out.println(row+col+1);
        if(row+col+1 == n){
            a = a + num;
            if(a==n*num){
                return player;
            }
        }
        if(col == row){
            b = b + num;
            if(b==n*num){
                return player;
            }
        }
        if (xWinList[row]==n*num||yWinList[col]==n*num){
            return player;
        }
        return 0;
    }
}
