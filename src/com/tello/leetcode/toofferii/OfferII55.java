package com.tello.leetcode.toofferii;

import com.tello.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class OfferII55 {
    Queue<Integer> queue;
    public OfferII55(TreeNode root) {
        queue = new LinkedList();
        inTree(root);
    }

    public void inTree(TreeNode node){
        if(node==null){
            return;
        }
        inTree(node.left);
        queue.offer(node.val);
        inTree(node.right);
    }

    public int next() {
        return queue.poll();
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
