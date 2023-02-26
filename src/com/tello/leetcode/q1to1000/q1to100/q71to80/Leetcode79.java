package com.tello.leetcode.q1to1000.q1to100.q71to80;

public class Leetcode79 {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        int xLength = board.length;
        int yLength = board[0].length;
        for (int i = 0; i < xLength; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == words[0]){
                    boolean[][] been = new boolean[xLength][yLength];
                    been[i][j] = true;
                    if(searchIfContain(board,been,words,1,i,j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean searchIfContain(char[][] board,boolean[][] been, char[] words,int now,int x,int y){
        if(now>=words.length){
            return true;
        }
        int[][] pos = new int[][]{{x-1,y},{x+1,y},{x,y-1},{x,y+1}};
        int xLength = board.length;
        int yLength = board[0].length;
        for (int i = 0; i < pos.length; i++) {
            int a = pos[i][0];
            int b = pos[i][1];
            if(a<0||a>=xLength||b<0||b>=yLength){
                continue;
            }
            System.out.println("a:"+a+" b:"+b);
            if(!been[a][b]&&board[a][b]==words[now]){
                been[a][b] = true;
                if(searchIfContain(board,been,words,now+1,a,b)){
                    return true;
                }
                been[a][b] = false;
            }
        }
        return false;
    }
}
