package com.tello.leetcode.toofferii;

import java.util.ArrayList;
import java.util.List;

public class OfferII3 {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] = 0;
        for(int i = 1; i <= n; i++){
            res[i] = res[i>>1] + i % 2;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(1>>1);
    }
}
