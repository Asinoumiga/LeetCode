package com.tello.leetcode.q1001to2000.q1481to1490;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class leetcode1481 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> place = new HashMap<>();
        for (int a:arr) {
            if(place.containsKey(a)){
                place.replace(a,place.get(a)+1);
            }else{
                place.put(a,1);
            }
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (Map.Entry entry:place.entrySet()) {
            queue.offer((Integer)entry.getValue());
        }
        while (k>0&&!queue.isEmpty()){
            k-=queue.poll();
        }
        if(k>0){
            return 0;
        }else if(k == 0){
            return queue.size();
        }else{
            return queue.size()+1;
        }
    }
}
