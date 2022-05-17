package com.tello.leetcode.q1to1000.q901to1000.q951to960;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Leetcode957 {
    public int[] prisonAfterNDays(int[] cells, int n) {
//    public String prisonAfterNDays(int[] cells, int n) {

        List<Integer> before = new ArrayList<>();
        int now = 0;
        for (int i = 0; i < cells.length; i++) {
            now^=cells[i]<<(cells.length-1-i);
        }
        before.add(now);
        int result = now;
        System.out.println(now);
        while (n>0){
            now = change(before.get(before.size()-1));
            System.out.println(now);
            if(before.contains(now)){
                int range = before.size()-before.indexOf(now);
                if(range!=1){
                    result = before.get(before.indexOf(now)+n%range-1);
                }else{
                    result = before.get(before.indexOf(now));
                }
                break;
            }else{
                before.add(now);
                n--;
            }
        }
        if(n==0){
            result = before.get(before.size()-1);
        }
        int[] ans = new int[8];
        for (int i = 0; i < 8; ++i) {
            if (((result >> (7-i)) & 1) > 0) {
                ans[i] = 1;
            }
        }
        return ans;
    }

    int change(int cell){
        int now = 0;
        for (int i = 1; i < 7; i++) {
            if((cell>>(i-1)&1)==(cell>>(i+1)&1)){
                now ^= 1<<i;
            }
        }
        return now;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,1,0,1,1,0,1,1};
//        int[] b = new Leetcode957().prisonAfterNDays(a,1);
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i]+" ");
//        }
        System.out.println(new Leetcode957().prisonAfterNDays(a,6));
//        System.out.println(Integer.toBinaryString(change(96)));

    }
}
