package com.tello.leetcode.q1to1000.q101to200.q111to120;

import com.tello.leetcode.common.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode116 {
    public Node connect(Node root) {
        if(root==null){
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if(i+1<size){
                    node.next = queue.peek();
                }
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
        }
        return root;
    }
}
