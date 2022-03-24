package com.tello.tooffer;

public class Offer55I {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
  int result;
    public int maxDepth(TreeNode root) {
        result = 0;
        inTree(root,result);
        return result;
    }

    void inTree(TreeNode node, int deep){
        if(node==null){
            return;
        }
        result = Math.max(result,deep+1);
        inTree(node.left,deep+1);
        inTree(node.right,deep+1);
    }
}
