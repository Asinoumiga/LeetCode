package com.tello.leetcode.q1to1000.q101to200.q141to150;

import com.tello.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leetcode144 {
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        intoNode(result,root);
//        return result;
//    }
//
//    public void intoNode(List<Integer> result, TreeNode node){
//        if(node==null){
//            return;
//        }
//        result.add(node.val);
//        intoNode(result,node.left);
//        intoNode(result,node.right);
//    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            result.add(node.val);
            if(node.right!=null){
                stack.add(node.right);
            }
            if(node.left!=null){
                stack.add(node.left);
            }
        }
        return result;
    }
}
