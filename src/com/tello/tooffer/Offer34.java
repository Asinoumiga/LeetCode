package com.tello.tooffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Offer34 {

      public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
  private List<List<Integer>> result;

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        result = new ArrayList<>();
        inTree(new ArrayList(),root,target);
        return result;
    }

    public void inTree(List<Integer> pathList,TreeNode node, int target){
        if(node == null){
            return;
        }
        pathList.add(node.val);
        if(node.left==null&&node.right==null){
            int a = 0;
            for (int i = 0; i < pathList.size(); i++) {
                a+=pathList.get(i);
            }
            if(a==target){
                result.add(new ArrayList<>(pathList));
            }
        }
        if(node.left!=null){
            inTree(pathList,node.left,target);
        }
        if(node.right!=null){
            inTree(pathList,node.right,target);
        }
        pathList.remove(pathList.size()-1);
    }
}
