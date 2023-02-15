package com.tello.leetcode.q1to1000.q101to200.q111to120;

import com.tello.leetcode.common.TreeNode;

public class Leetcode112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        boolean result = false;
        targetSum -= root.val;
        if(root.left==null&&root.right==null){
            if(targetSum==0){
                return true;
            }
            return false;
        }
        return hasPathSum(root.left,targetSum)||hasPathSum(root.right,targetSum);
    }

    public boolean intoPath(TreeNode root, int targetSum) {
        if(root==null){
            if(targetSum==0){
                return true;
            }
            return false;
        }
        return intoPath(root.left,targetSum-root.val)||intoPath(root.right,targetSum-root.val);
    }
}
