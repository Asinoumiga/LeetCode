package com.tello.leetcode.q1to1000.q1to100.q91to100;

import com.tello.leetcode.common.TreeNode;

import java.util.*;

public class Leetcode94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> tempList = new Stack<>();
        while (root!=null||!tempList.isEmpty()){
            while (root!=null){
                tempList.push(root);
                root = root.left;
            }
            root = tempList.pop();
            result.add(root.val);
            root = root.right;
        }
        return result;
    }
}
