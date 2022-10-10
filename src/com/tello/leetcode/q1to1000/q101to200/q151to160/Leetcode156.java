package com.tello.leetcode.q1to1000.q101to200.q151to160;

import com.tello.leetcode.common.TreeNode;

public class Leetcode156 {
    TreeNode node = null;
    public TreeNode upsideDownBinaryTree(TreeNode root) {
        if(root != null){
            inside(root);
        }
        return node;
    }

    TreeNode inside(TreeNode root){
        if(root.left == null){
            if(node==null){
                node = root;
            }
            return root;
        }
        TreeNode left = inside(root.left);
        TreeNode right = null;
        if(root.right !=null){
            right = inside(root.right);
        }
        root.left = null;
        root.right = null;
        left.left = right;
        left.right = root;
        return root;
    }
}
