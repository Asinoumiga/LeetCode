package com.tello.leetcode.q1to1000.q1to100.q91to100;

import com.tello.leetcode.common.TreeNode;

public class Leetcode98 {
    long nowValue = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        if(!isValidBST(root.left)){
            return false;
        }
        if(root.val<nowValue){
            return false;
        }
        nowValue = root.val;
        if(!isValidBST(root.right)){
            return false;
        }
        return true;
    }

}
