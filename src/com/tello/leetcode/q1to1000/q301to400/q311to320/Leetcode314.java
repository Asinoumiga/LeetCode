package com.tello.leetcode.q1to1000.q301to400.q311to320;

import com.tello.leetcode.common.TreeNode;

import java.util.*;

public class Leetcode314 {
    static class TempNode{
        int now;
        TreeNode node;
        public TempNode(int now,TreeNode node){
            this.now = now;
            this.node = node;
        }
    }
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Map<Integer,List<Integer>> treeMap = new HashMap<>();
        Queue<TempNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(new TempNode(0,root));
        int min = 0;
        int max = 0;
        while (!nodeQueue.isEmpty()){
            int levelNum = nodeQueue.size();
            for (int i = 0; i < levelNum; i++) {
                TempNode temp = nodeQueue.poll();
                System.out.println(levelNum+" "+temp.now);
                List<Integer> nowList = treeMap.getOrDefault(temp.now,new ArrayList<>());
                nowList.add(temp.node.val);
                treeMap.put(temp.now,nowList);
                if(temp.node.left!=null){
                    nodeQueue.offer(new TempNode(temp.now-1,temp.node.left));
                }else if(temp.now<min){
                    min = temp.now;
                }
                if(temp.node.right!=null){
                    nodeQueue.offer(new TempNode(temp.now+1,temp.node.right));
                }else if(temp.now>max){
                    max = temp.now;
                }
            }
        }
        for (int i = min; i <= max; i++) {
            result.add(treeMap.get(i));
        }
        return result;
    }

//    void intoTree(Map<Integer,List<Integer>> treeMap,TreeNode node,int now){
//        if(node==null){
//            return;
//        }
//        if(now<min){
//            min = now;
//        }
//        if(now>max){
//            max = now;
//        }
//        List<Integer> nowList = treeMap.getOrDefault(now,new ArrayList<>());
//        nowList.add(node.val);
//        treeMap.put(now,nowList);
//        intoTree(treeMap,node.left,now-1);
//        intoTree(treeMap,node.right,now+1);
//    }
}
