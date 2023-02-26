package com.tello.leetcode.q1to1000.q101to200.q101to110;

import com.tello.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode110 {
    boolean result = true;
    public boolean isBalanced(TreeNode root) {
        getInto(root);
        return result;
    }

    public int getInto(TreeNode node){
        if(node==null){
            return 0;
        }
        int right = getInto(node.right);
        int left = getInto(node.left);
        if(Math.abs(right-left)>1){
            result = false;
        }
        return right>left?right+1:left+1;
    }
}
