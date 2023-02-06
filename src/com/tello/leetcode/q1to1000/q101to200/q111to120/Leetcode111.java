package com.tello.leetcode.q1to1000.q101to200.q111to120;

import com.tello.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode111 {
    public int minDepth(TreeNode root) {
        int result = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            result++;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node.left==null&&node.right==null){
                    return result;
                }
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
        }
        return result;
    }
}
