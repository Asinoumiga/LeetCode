package com.tello.leetcode.toofferii;

import java.util.ArrayList;
import java.util.List;

public class OfferII80 {
    List<List<Integer>> result;
    List<Integer> nowList;
    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<>();
        nowList = new ArrayList<>();
        getList(1,n,k);
        return result;
    }

    public void getList(int now,int n,int k){
        if(nowList.size()+n-now+1<k){
            return;
        }
        if(nowList.size()==k){
            result.add(new ArrayList<>(nowList));
            return;
        }
        nowList.add(now);
        getList(now+1,n,k);
        nowList.remove(new Integer(now));
        getList(now+1,n,k);
    }
}
