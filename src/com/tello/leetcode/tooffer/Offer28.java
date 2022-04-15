package com.tello.leetcode.tooffer;

public class Offer28 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        return inTree(left,right);
    }
    public boolean inTree(TreeNode left, TreeNode right){
        if(left==null&&right==null){
            return true;
        }
        if(left==null||right==null){
            return false;
        }
        if(left.val == right.val){
            if(inTree(left.left,right.right)&&inTree(left.right,right.left)){
                return true;
            }
        }
        return false;
    }
}
