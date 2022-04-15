package com.tello.leetcode.q1to1000.q1to100.q61to70;

//63. ²»Í¬Â·¾¶ I
public class LeeCode63 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if(obstacleGrid[0][0]==1){
            return 0;
        }
        int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		int[][] pathArr = new int[m][n];
        int initx=1;
        int inity=1;
    	for (int i = 0; i < m; i++) {
    		if(obstacleGrid[i][0]==1) {
                initx=0;
            }
    			pathArr[i][0] = initx;    			
		}
    	for (int i = 0; i < n; i++) {
    		if(obstacleGrid[0][i]==1) {
                inity=0;
            }
    			pathArr[0][i] = inity;    			
		}
    	for (int i = 1; i < m; i++) {
    		for (int j = 1; j < n; j++) {
                if(obstacleGrid[i][j]!=1){
                    pathArr[i][j] = (obstacleGrid[i-1][j]==1?0:pathArr[i-1][j])+(obstacleGrid[i][j-1]==1?0:pathArr[i][j-1]);
                }
    		}
		}
		return pathArr[m-1][n-1];
    }
}
