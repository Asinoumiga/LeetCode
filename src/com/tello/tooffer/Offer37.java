package com.tello.tooffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//剑指 Offer 37. 序列化二叉树
public class Offer37 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "";
        }
        List<Integer> result = new ArrayList<>();
        result.add(root.val);
        Queue<TreeNode> nodeQueue = new LinkedList();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()){
            for (int i = 0; i < nodeQueue.size(); i++) {
                TreeNode node = nodeQueue.poll();
                if (node.left!=null){
                    nodeQueue.offer(node.left);
                    result.add(node.left.val);
                }else{
                    result.add(null);
                }
                if(node.right!=null){
                    nodeQueue.offer(node.right);
                    result.add(node.right.val);
                }else{
                    result.add(null);
                }
            }
        }
        for (int i = result.size()-1; i >=0 ; i--) {
            if(result.get(i)==null){
                result.remove(i);
            }else{
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Integer a:result) {
            sb.append(a);
            sb.append(",");
        }

        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append("]");
        System.out.println(sb.toString());
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return null;
    }

}
