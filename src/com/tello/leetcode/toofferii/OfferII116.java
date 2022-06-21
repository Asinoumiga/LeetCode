package com.tello.leetcode.toofferii;

import java.util.*;

public class OfferII116 {
    public int findCircleNum(int[][] isConnected) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 1; i <= isConnected.length; i++) {
            temp.add(i);
        }
        int result = 0;
        Queue<Integer> path = new LinkedList();
        while (temp.size()!=0){
            result++;
            path.add(temp.remove(0));
            while (!path.isEmpty()){
                int now = path.poll();
                for (int i = temp.size()-1; i >=0; i--) {
                    if(isConnected[now-1][temp.get(i)-1]==1){
                        path.add(temp.get(i));
                        temp.remove(i);
                    }
                }
            }
        }
        return result;
    }
}
