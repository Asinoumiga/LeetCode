package com.tello.leetcode.q1to1000.q101to200.q101to110;

import com.tello.leetcode.common.TreeNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode105 {
    Map<Integer,Integer> cache;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        cache = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            cache.put(inorder[i],i);
        }
        return intoIt(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }

    public TreeNode intoIt(int[] preorder,int[] inorder,int prePre,int preBack,int inPre,int inBack){
        if(prePre>preBack){
            return null;
        }
        TreeNode node = new TreeNode(preorder[prePre]);
        if(prePre==preBack){
            return node;
        }
        int index = cache.get(preorder[prePre]);
        int leftLength = index - inPre;
        TreeNode left = intoIt(preorder, inorder, prePre + 1, prePre + leftLength, inPre, index - 1);
        TreeNode right = intoIt(preorder, inorder, prePre + leftLength + 1, preBack, index + 1, inBack);
        node.left = left;
        node.right = right;
        return node;
    }

}
