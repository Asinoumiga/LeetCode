package com.tello.leetcode.toofferii;

import com.tello.leetcode.common.TreeNode;

//剑指 Offer II 054. 所有大于等于节点的值之和
public class OfferII54 {
    int nowValue;
    public TreeNode convertBST(TreeNode root) {
        if(root==null){
            return null;
        }
        convertBST(root.right);
        nowValue += root.val;
        root.val = nowValue;
        convertBST(root.left);
        return root;
    }
}
