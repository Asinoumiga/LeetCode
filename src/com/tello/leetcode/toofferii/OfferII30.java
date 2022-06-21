package com.tello.leetcode.toofferii;

import java.util.*;

public class OfferII30 {
    List<Integer> numList;
    Map<Integer,Integer> numMap;
    /** Initialize your data structure here. */
    public OfferII30() {
        numList = new ArrayList<>();
        numMap = new HashMap<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(numMap.containsKey(val)){
            return false;
        }
        numList.add(val);
        numMap.put(val,numList.size()-1);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(numMap.containsKey(val)){
            int index = numMap.get(val);
            numMap.put(numList.get(numList.size()-1),index);
            numList.set(index,numList.size()-1);
            numList.remove(numList.size()-1);
            numMap.remove(val);
            return true;
        }
        return false;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return numList.get(new Random().nextInt(numList.size()));
    }
}
