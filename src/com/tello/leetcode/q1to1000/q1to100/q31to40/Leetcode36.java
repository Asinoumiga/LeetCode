package com.tello.leetcode.q1to1000.q1to100.q31to40;

public class Leetcode36 {
    public boolean isValidSudoku(char[][] board) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if(!checkX(board,i))return false;
            if(!checkY(board,i))return false;
        }
        for (int i = 0; i < board.length; i=i+3) {
            for (int j = 0; i < board.length; j=j+3) {
                if(!checkXY(board,i,j))return false;
            }
        }
        return true;
    }

    public boolean checkX(char[][] board, int x){
        int[] temp = new int[9];
        for (int i = 0; i < board.length; i++) {
            if(board[x][i]!='.'){
                if(temp[board[x][i]-'1']!=0){
                    return false;
                }else{
                    temp[board[x][i]-'1'] = 1;
                }
            }
        }
        return true;
    }

    public boolean checkY(char[][] board, int y){
        int[] temp = new int[9];
        for (int i = 0; i < board.length; i++) {
            if(board[i][y]!='.'){
                if(temp[board[i][y]-'1']!=0){
                    return false;
                }else{
                    temp[board[i][y]-'1'] = 1;
                }
            }
        }
        return true;
    }

    public boolean checkXY(char[][] board, int x,int y){
        int[] temp = new int[9];
        for (int i = x; i < x+3; i++) {
            for (int j = y; j < y+3; j++) {
                System.out.println("x:"+x+" y:"+y);
                if(board[i][j]!='.'){
                    if(temp[board[i][j]-'1']!=0){
                        return false;
                    }else{
                        temp[board[i][j]-'1'] = 1;
                    }
                }
            }
        }
        return true;
    }
}
