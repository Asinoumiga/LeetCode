package com.tello.tooffer;

import java.util.LinkedList;
import java.util.Queue;

public class Offer55II {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
//  A Plan

//    public boolean isBalanced(TreeNode root) {
//          if(root==null){
//              return false;
//         }
//        return Math.abs(inTree(root.left)-inTree(root.right))<2&&isBalanced(root.left)&&isBalanced(root.right);
//    }
//    int inTree(TreeNode node){
//        if(node==null){
//            return 0;
//        }
//        int left = inTree(node.left)+1;
//        int right = inTree(node.right)+1;
//        return Math.max(left,right);
//    }

//    B plan

    public boolean isBalanced(TreeNode root) {
        return inTree(root)>=0;
    }

    int inTree(TreeNode node){
          if(node == null){
              return 0;
          }
          int left = inTree(node.left);
          int right = inTree(node.right);
          if(left == -1||right == -1||Math.abs(left-right)>1){
              return -1;
          }else{
              return Math.max(left,right)+1;
          }
    }
}
