package com.tello.leetcode.q1to1000.q701to800.q731to740;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Leetcode739 {
//    public int[] dailyTemperatures(int[] temperatures) {
//        int length = temperatures.length;
//        int pre = 0;
//        int[] result = new int[length];
//        Deque<Integer[]> cache = new LinkedList<>();
//        while (pre<length){
//            while (!cache.isEmpty()&&cache.peek()[0]<temperatures[pre]){
//                int temp = cache.pop()[1];
//                result[temp] = pre-temp;
//            }
//            cache.push(new Integer[]{temperatures[pre],pre});
//            pre++;
//        }
//        return result;
//    }
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int back = length-1;
        int[] result = new int[length];
        Deque<Integer[]> cache = new LinkedList<>();
        cache.push(new Integer[]{temperatures[back],back});
        result[back--]=0;
        while (back>=0){
            while (!cache.isEmpty()&&temperatures[back]>=cache.peek()[0]){
                cache.pop();
            }
            if(cache.isEmpty()){
                result[back] = 0;
            }else{
                result[back] = cache.peek()[1] - back;
            }
            cache.push(new Integer[]{temperatures[back],back});
            back--;
        }
        return result;
    }
//    public int[] dailyTemperatures(int[] temperatures) {
//        int pre = 0;
//        int back;
//        int length = temperatures.length;
//        int[] result = new int[length];
//        while (pre<length){
//            back = pre+1;
//            while (back<length&&temperatures[back]<=temperatures[pre]){
//                back++;
//            }
//            if(back>=length){
//                result[pre] = 0;
//            }else{
//                result[pre] = back-pre;
//            }
//            pre++;
//            while (pre<back&&temperatures[pre]>=temperatures[pre-1]){
//                result[pre] = result[pre-1]==0?0:result[pre-1]-1;
//                pre++;
//            }
//        }
//        return result;
//    }
}
