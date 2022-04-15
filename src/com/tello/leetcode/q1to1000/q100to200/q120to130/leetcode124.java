package com.tello.leetcode.q1to1000.q100to200.q120to130;

//124. 二叉树中的最大路径和
public class leetcode124 {
         public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
         }
      }
//    int MIN = -10000;
//    public int maxPathSum(TreeNode root) {
//        if(root==null){
//            return MIN;
//        }
//        int result = Math.max(root.val,Math.max(maxPathSum(root.left),maxPathSum(root.right)));
//        int right = getSingleMaxPath(root.right);
//        int left = getSingleMaxPath(root.left);
//        if(right!=MIN&&left!=MIN){
//            result = Math.max(result,root.val+right+left);
//        }
//        if(right!=MIN){
//            result = Math.max(result,root.val+right);
//        }
//        if(left!=MIN){
//            result = Math.max(result,root.val+left);
//        }
//        return result;
//    }
//    public int getSingleMaxPath(TreeNode node){
//        if(node==null){
//            return MIN;
//        }
//        int a = Math.max(getSingleMaxPath(node.left),getSingleMaxPath(node.right));
//        if(a==MIN){
//            return node.val;
//        }
//        return Math.max(node.val,a+node.val);
//    }
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        getMaxSum(root);
        return maxSum;
    }
    public int getMaxSum(TreeNode node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int left = Math.max(0,getMaxSum(node.left));
        int right = Math.max(0,getMaxSum(node.right));
        int sum = node.val+left+right;
        if(sum>maxSum){
            maxSum = sum;
        }
        return node.val+Math.max(left,right);
    }
}
