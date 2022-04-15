package com.tello.leetcode.tooffer;

//剑指 Offer 12. 矩阵中的路径
public class Offer12 {
    private int[][] direction = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private boolean[][] marked;

    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        if (word == null || word.length() == 0){
            return false;
        }
        marked = new boolean[board.length][board[0].length];
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(haveTargetString(board,word,j,i,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean haveTargetString(char[][] board, String word,int x,int y,int wordPos){
        if(wordPos == word.length()){
            return true;
        }
        if(x<0||y<0||x>board[0].length-1||y>board.length-1||board[y][x]!=word.charAt(wordPos)||marked[y][x]==true){
            return false;
        }
        marked[y][x] = true;
        for (int i = 0; i < direction.length; i++) {
            if(haveTargetString(board,word,x+direction[i][0],y+direction[i][1],wordPos+1)){
                return true;
            }
        }
        marked[y][x] = false;
        return false;
    }
}
