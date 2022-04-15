package com.tello.leetcode.tooffer;

public class Offer36 {
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };

    Node head;
    Node pre;
    public Node treeToDoublyList(Node root) {
        Node right = inTree(root);
        head.left = right;
        right.right = head;
        return head;
    }
    public Node inTree(Node node){
        if(node==null){
            return null;
        }
        Node left = inTree(node.left);
        if(left==null&&head==null){
            head = node;
        }else if(left == null&&pre!=null){
            pre.right = node;
            node.left = pre;
        }
        if(left!=null){
            left.right = node;
            node.left = left;
        }
        pre = node;
        Node right = inTree(node.right);
        if(right!=null){
            return right;
        }else{
            return node;
        }
    }
}

//[7,3,8,1,5,null,null,null,null,2,6]
