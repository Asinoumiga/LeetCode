package com.tello.leetcode.mianshi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Mianshi32I {
      public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
     TreeNode(int x) { val = x; }
 }

    public int[] levelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        TreeNode treeNode;
        while (!queue.isEmpty()){
            treeNode = queue.poll();
            if(treeNode==null){
                continue;
            }
            result.add(treeNode.val);
            queue.offer(treeNode.left);
            queue.offer(treeNode.right);
        }
        int[] resultIntList = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultIntList[i] = result.get(i);
        }
        return resultIntList;
    }
}
