package com.tello.leetcode.q1to1000.q101to200.q101to110;

import com.tello.leetcode.common.TreeNode;

import java.util.Stack;

public class Leetcode101 {
//    public boolean isSymmetric(TreeNode root) {
//        return checkSym(root.left,root.right);
//    }
//
//    boolean checkSym(TreeNode left,TreeNode right){
//        if(left==null&&right==null){
//            return true;
//        }else if(left==null){
//            return false;
//        }else if(right==null){
//            return false;
//        }
//        if(left.val!=right.val){
//            return false;
//        }
//        return checkSym(left.left,right.right)&&checkSym(left.right,right.left);
//    }
    public boolean isSymmetric(TreeNode root) {
        Stack<TreeNode> leftStack = new Stack<>();
        Stack<TreeNode> rightStack = new Stack<>();
        leftStack.push(root.left);
        rightStack.push(root.right);
        while (!leftStack.isEmpty()&&!rightStack.isEmpty()){
            TreeNode left = leftStack.pop();
            TreeNode right = rightStack.pop();
            System.out.println(left+" "+right);
            if(left==null&&right==null){
                continue;
            }else if(left==null||right==null){
                return false;
            }
            if(left.val!=right.val){
                return false;
            }
            leftStack.push(left.left);
            leftStack.push(left.right);
            rightStack.push(right.right);
            rightStack.push(right.left);
        }
        return leftStack.isEmpty()&&rightStack.isEmpty();
    }

    public static void main(String[] args) {
        Leetcode101 leetcode101 = new Leetcode101();
        leetcode101.isSymmetric(new TreeNode(1));
    }
}
