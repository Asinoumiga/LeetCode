package com.tello.tooffer;

//½£Ö¸ Offer 27. ¶þ²æÊ÷µÄ¾µÏñ
public class Offer27 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);
        TreeNode result = new TreeNode(root.val);
        result.left = right;
        result.right = left;
        return result;
    }

    public TreeNode inTree(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode left = inTree(root.left);
        TreeNode right = inTree(root.right);
        TreeNode result = new TreeNode(root.val);
        result.left = right;
        result.right = left;
        return result;
    }
}
