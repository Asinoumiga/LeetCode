package com.tello.leetcode.q1to1000.q101to200.q191to200;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//199. ¶þ²æÊ÷µÄÓÒÊÓÍ¼
public class Leetcode199 {
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            result.add(queue.peek().val);
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node =queue.poll();
                if(node.right!=null){
                    queue.offer(node.right);
                }
                if(node.left!=null){
                    queue.offer(node.left);
                }
            }
        }
        return result;
    }
}
