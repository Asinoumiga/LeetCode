package com.tello.leetcode.q1to1000.q501to600.q541to550;

import com.tello.leetcode.common.TreeNode;

public class Leetcode543 {
    int result = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        intoTree(root);
        return result;
    }
    public int intoTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        if(left+right+1>result){
            result = left+right+1;
        }
        return Math.max(left,right)+1;
    }
}
