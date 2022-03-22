package com.tello.tooffer;

//��ָ Offer 54. �����������ĵ�k��ڵ�
public class Offer54 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    int target;
    TreeNode result;
    public int kthLargest(TreeNode root, int k) {
        target = k;
        inTree(root,k);
        return result.val;
    }

    public void inTree(TreeNode node,int k){
        if(node == null){
            return;
        }
        if(target == 0){
            return;
        }
        inTree(node.right,k);
        if(target--==1){
            result = node;
        }
        inTree(node.left,k);
    }
}
