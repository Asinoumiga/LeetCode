package com.tello.leetcode.q1to1000.q101to200.q141to150;

import com.tello.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leetcode145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode pre = null;
        while (current!=null || !stack.isEmpty()){
            while (current!=null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            if(current.right==null||current.right==pre){
                result.add(current.val);
                pre = current;
                current = null;
            }else{
                stack.push(current);
                current = current.right;
            }
        }
        return result;
    }
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        intoTree(result,root);
//        return result;
//    }
//
//    public void intoTree(List<Integer> result,TreeNode node){
//        if(node==null){
//            return;
//        }
//        intoTree(result,node.left);
//        intoTree(result,node.right);
//        result.add(node.val);
//    }
}
