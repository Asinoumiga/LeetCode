package com.tello.leetcode.q1to1000.q201to300.q221to230;

import com.tello.leetcode.common.TreeNode;

public class Leetcode226 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
