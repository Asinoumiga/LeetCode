package com.tello.tooffer;

import java.util.ArrayList;
import java.util.List;

//剑指 Offer 32 - II. 从上到下打印二叉树 II
public class Offer32II {

     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> numList = new ArrayList<>();
        intoTree(numList,root,0);
        return numList;
    }

    public void intoTree(List<List<Integer>> numList, TreeNode node,int range){
         if(node == null){
             return;
         }
         if(numList.size()<range+1){
             List<Integer> a = new ArrayList<>();
             a.add(node.val);
             numList.add(a);
         }else{
             numList.get(range).add(node.val);
         }
         intoTree(numList,node.left,++range);
        intoTree(numList,node.right,++range);
    }
}
