package com.tello.leetcode.tooffer;

//剑指 Offer 26. 树的子结构
public class Offer26 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null||B==null){
            return false;
        }
        return isSubStructure2(A,B);
    }

    public boolean isSubStructure2(TreeNode A, TreeNode B) {
        if(B==null){
            return true;
        }
        if(A==null){
            return false;
        }
        if(A.val==B.val){
            if(isSubStructure(A.left,B.left)&&isSubStructure(A.right,B.right)){
                return true;
            }
        }
        return isSubStructure(A.right,B)||isSubStructure(A.left,B);
    }
}
