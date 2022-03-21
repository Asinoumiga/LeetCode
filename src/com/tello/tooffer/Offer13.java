package com.tello.tooffer;

import java.util.LinkedList;
import java.util.Queue;

//剑指 Offer 13. 机器人的运动范围
public class Offer13 {
    private int[][] direct = {{0,1},{1,0},{-1,0},{0,-1}};
    boolean[][] isVisited;
    int result;

    public int movingCount(int m, int n, int k) {
        isVisited = new boolean[m][n];
        result = 0;
        if(k==0){
            return 1;
        }
        reach(0,0,m,n,k);
        return result;
    }

    public void reach(int x, int y , int m,int n,int k){
        if(x<0||y<0||x>n-1||y>m-1||isVisited[y][x]==true){
            return;
        }
        if(x/100+x%10+(x/10)%10+y/100+y%10+(y/10)%10>k){
            return;
        }
        isVisited[y][x]=true;
        result++;
        for (int i = 0; i < direct.length; i++) {
            reach(x+direct[i][0],y+direct[i][1],m,n,k);
        }
    }
}
