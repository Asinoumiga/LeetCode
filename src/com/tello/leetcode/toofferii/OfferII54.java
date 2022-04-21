package com.tello.leetcode.toofferii;

import com.tello.leetcode.common.TreeNode;

//��ָ Offer II 054. ���д��ڵ��ڽڵ��ֵ֮��
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
