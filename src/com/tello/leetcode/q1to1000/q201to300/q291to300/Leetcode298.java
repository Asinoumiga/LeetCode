package com.tello.leetcode.q1to1000.q201to300.q291to300;

import com.tello.leetcode.common.TreeNode;

public class Leetcode298 {
    int max = 1;
    public int longestConsecutive(TreeNode root) {
        if(root==null){
            return 0;
        }
        seeMaxNum(root);
        return max;
    }

    int seeMaxNum(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftMax=0;
        if(node.left!=null){
            leftMax = seeMaxNum(node.left);
            if(leftMax==0||node.val+1==node.left.val){
                leftMax++;
            }else{
                leftMax = 1;
            }
        }else{
            leftMax = 1;
        }
        int rightMax=0;
        if(node.right!=null){
            rightMax= seeMaxNum(node.right);
            if(rightMax==0||node.val+1==node.right.val){
                rightMax++;
            }else {
                rightMax =1;
            }
        }else{
            rightMax = 1;
        }
        if(leftMax>rightMax){
            if(leftMax>max){
                max = leftMax;
            }
            System.out.println(leftMax);
            return leftMax;
        }else{
            if(rightMax>max){
                max = rightMax;
            }
            System.out.println(rightMax);
            return rightMax;
        }
    }
}
