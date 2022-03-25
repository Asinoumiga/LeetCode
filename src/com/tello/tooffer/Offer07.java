package com.tello.tooffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Offer07 {
     public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0){
            return null;
        }
        return buildTree(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    public TreeNode buildTree(int[] preorder,int[] inorder,int preorderPre,int preorderBack,int inorderPre,int inorderBack){
        int inorderRootPos = -1;
        if(inorderPre>inorderBack){
            return null;
        }
        if(inorderPre==inorderBack){
            return new TreeNode(inorder[inorderPre]);
        }
        for (int i = inorderPre; i <= inorderBack; i++) {
            if(preorder[preorderPre]==inorder[i]){
                inorderRootPos = i;
                break;
            }
        }
        int num = inorderRootPos-inorderPre+1;
        TreeNode result = new TreeNode(inorder[inorderRootPos]);
        TreeNode left = buildTree(preorder,inorder,preorderPre+1,inorderRootPos+num,inorderPre,inorderRootPos-1);
        TreeNode right = buildTree(preorder,inorder,preorderPre+num,preorderBack,inorderRootPos+1,inorderBack);
        result.left = left;
        result.right = right;
        return result;
    }

    public static void main(String[] args) {
        int[] a = new int[]{3,9,2,5,6,1,8,20,15,4,10,7};
        int[] b = new int[]{5,2,9,1,6,8,3,4,15,10,20,7};
        Offer07 offer07 = new Offer07();
        offer07.buildTree(a,b);
//        List<Integer> a = Arrays.asList(9,3,15,20,7);
//        AtomicInteger b = new AtomicInteger(0);
//        int inorderRootPos= a.stream()
//                .filter(i -> i==15)
//                .findFirst()
//                .get();
//        System.out.println(inorderRootPos);
     }
}
