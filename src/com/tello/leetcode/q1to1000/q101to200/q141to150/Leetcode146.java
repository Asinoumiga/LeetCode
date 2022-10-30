package com.tello.leetcode.q1to1000.q101to200.q141to150;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Leetcode146 {
    class PreBackLinkNode{
        Integer key;
        Integer value;
        PreBackLinkNode pre;
        PreBackLinkNode back;
        PreBackLinkNode(Integer key,Integer value){
            this.key = key;
            this.value = value;
        }
        PreBackLinkNode(){}
    }

    Map<Integer,PreBackLinkNode> numMap;
    PreBackLinkNode begin;
    PreBackLinkNode end;
    int maxSize;
    public Leetcode146(int capacity) {
        numMap = new LinkedHashMap<>();
        this.maxSize = capacity;
        begin = new PreBackLinkNode();
        end = new PreBackLinkNode();
        begin.back = end;
        end.pre = begin;
    }

    public int get(int key) {
        if(numMap.containsKey(key)){
            PreBackLinkNode node = numMap.get(key);
            removeNode(node);
            addNode(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        PreBackLinkNode node;
        if(numMap.containsKey(key)){
            node = numMap.get(key);
            removeNode(node);
            node.value = value;
            addNode(node);
            return;
        }
        if(numMap.size()==maxSize){
            numMap.remove(begin.back.key);
            removeNode(begin.back);
        }
        node = new PreBackLinkNode(key,value);
        addNode(node);
        numMap.put(key,node);
    }

    void removeNode(PreBackLinkNode node){
        if(node == null){
            return;
        }
        node.pre.back = node.back;
        node.back.pre = node.pre;
    }
    void addNode(PreBackLinkNode node){
        if(node == null){
            return;
        }
        node.pre = end.pre;
        node.back = end;
        end.pre.back = node;
        end.pre = node;
    }
}
