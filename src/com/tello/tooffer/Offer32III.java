package com.tello.tooffer;

import java.util.*;

public class Offer32III {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        queue.add(root);
        int height = 1;
        while(!queue.isEmpty()){
            List<Integer> subList = new ArrayList<>();
            while(!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if(node==null){
                    continue;
                }
                subList.add(node.val);
                stack.push(node);
            }
            if(subList.size()!=0){
                result.add(subList);
            }
            while (!stack.isEmpty()){
                TreeNode node = stack.pop();
                if(height%2==1){
                    queue.add(node.right);
                    queue.add(node.left);
                }else{
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            height++;
        }
        return result;
    }

}
