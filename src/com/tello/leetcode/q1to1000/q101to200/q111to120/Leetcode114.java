package com.tello.leetcode.q1to1000.q101to200.q111to120;

import com.tello.leetcode.common.TreeNode;

public class Leetcode114 {
    TreeNode now= new TreeNode();;
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        now.right = root;
        now = root;
        TreeNode right = root.right;
        flatten(root.left);
        root.right = root.left;
        root.left = null;
        flatten(right);
    }
}
