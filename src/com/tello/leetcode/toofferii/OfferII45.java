package com.tello.leetcode.toofferii;

import com.tello.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class OfferII45 {
    public int findBottomLeftValue(TreeNode root) {
        int result = 0;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()){
            result = nodeQueue.peek().val;
            int size = nodeQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = nodeQueue.poll();
                if(node.left!=null){
                    nodeQueue.offer(node.left);
                }
                if(node.right!=null){
                    nodeQueue.offer(node.right);
                }
            }
        }
        return result;
    }
}
