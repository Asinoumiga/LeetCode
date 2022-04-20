package com.tello.leetcode.q1to1000.q101to200.q101to110;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Leetcode103 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        int level = 0;
        while (!deque.isEmpty()){
            level++;
            List<Integer> inResult = new ArrayList<>();
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node;
                if(level%2==0){
                    node = deque.pollLast();
                    inResult.add(node.val);
                    if(node.right!=null){
                        deque.offerFirst(node.right);
                    }
                    if(node.left!=null) {
                        deque.offerFirst(node.left);
                    }
                }else{
                    node =deque.pollFirst();
                    inResult.add(node.val);
                    if(node.left!=null) {
                        deque.offerLast(node.left);
                    }
                    if(node.right!=null){
                        deque.offerLast(node.right);
                    }
                }

            }
            result.add(inResult);
        }
        return result;
    }
}
