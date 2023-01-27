package com.tello.leetcode.q1to1000.q101to200.q101to110;

import com.tello.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> valueList = new ArrayList<>();
            Integer size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                valueList.add(temp.val);
                if(temp.left!=null){
                    queue.offer(temp.left);
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                }
            }
            result.add(valueList);
        }
        return result;
    }
}
