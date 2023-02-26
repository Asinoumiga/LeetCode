package com.tello.leetcode.q1to1000.q201to300.q231to240;

import com.tello.leetcode.common.TreeNode;

public class Leetcode236 {
    TreeNode result = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        contain(root,p,q);
        return result;
    }

    public int contain(TreeNode node,TreeNode p,TreeNode q){
        if(node==null){
            return 0;
        }
        int left = contain(node.left,p,q);
        int right = contain(node.right,p,q);
        int now = 0;
        if(node==p||node==q){
            now++;
        }
        if(left+right+now==2){
            result = node;
            return 3;
        }else if(left+right>2){
            return 3;
        }else{
            return left+right+now;
        }
    }
}
