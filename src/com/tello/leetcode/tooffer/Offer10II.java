package com.tello.leetcode.tooffer;

import java.util.ArrayList;
import java.util.List;

public class Offer10II {
    public int numWays(int n) {
        if(n==0)return 1;
        if(n==1)return 1;
        List<Integer> numWays = new ArrayList<>();
        numWays.add(0);
        numWays.add(1);
        while (numWays.size()-1<n){
            numWays.add((numWays.get(numWays.size()-2)+numWays.get(numWays.size()-1))%1000000007);
        }
        return numWays.get(n);
    }
}
