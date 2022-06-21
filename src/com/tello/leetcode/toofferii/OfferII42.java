package com.tello.leetcode.toofferii;

import java.util.*;

public class OfferII42 {
    Queue<Integer> pingList;
    public OfferII42() {
        pingList = new LinkedList<>();
    }

    public int ping(int t) {
        while (!pingList.isEmpty()&&pingList.peek()<t-3000){
            pingList.poll();
        }
        pingList.offer(t);
        return pingList.size();
//        for (int i = 0; i < pingList.size(); i++) {
//            if(pingList.get(i)<min){
//                pingList.remove(i);
//            }else{
//                break;
//            }
//        }
    }
}
