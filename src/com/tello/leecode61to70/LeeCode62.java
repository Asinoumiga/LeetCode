package com.tello.leecode61to70;

import java.util.Arrays;

//62. ²»Í¬Â·¾¶
public class LeeCode62 {
    public int uniquePaths(int m, int n) {
    	int[][] pathArr = new int[m][n];
    	for (int i = 0; i < m; i++) {
    		pathArr[i][0] = 1;
		}
    	for (int i = 0; i < n; i++) {
    		pathArr[0][i] = 1;
		}
    	for (int i = 1; i < m; i++) {
    		for (int j = 1; j < n; j++) {
    			pathArr[i][j] = pathArr[i-1][j]+pathArr[i][j-1];
    		}
		}
		return pathArr[m-1][n-1];
    }
}
