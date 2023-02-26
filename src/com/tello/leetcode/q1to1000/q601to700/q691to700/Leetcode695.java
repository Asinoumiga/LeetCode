package com.tello.leetcode.q1to1000.q601to700.q691to700;

public class Leetcode695 {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j]==1){
                    grid[i][j] = 2;
                    int num = checkPosition(grid,i,j)+1;
                    if(maxArea<num){
                        maxArea = num;
                    }
                }
            }
        }
        return maxArea;
    }

    int checkPosition(int[][] grid,int y,int x){
        int num = 0;
        if(y>0&&grid[y-1][x]==1){
            grid[y-1][x]=2;
            num+=checkPosition(grid,y-1,x);
        }
        if(x>0&&grid[y][x-1]==1){
            grid[y][x-1]=2;
            num+=checkPosition(grid,y,x-1);
        }
        if(y<grid.length-1&&grid[y+1][x]==1){
            grid[y+1][x]=2;
            num+=checkPosition(grid,y+1,x);
        }
        if(x<grid[0].length-1&&grid[y][x+1]==1){
            grid[y][x+1]=2;
            num+=checkPosition(grid,y,x+1);
        }
        System.out.println("y:"+y+" x:"+x+" num:"+num);
        return num;
    }
}
