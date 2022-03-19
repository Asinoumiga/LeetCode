package com.tello.tooffer;

import java.util.HashMap;

//剑指 Offer 35. 复杂链表的复制
public class Offer35 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    HashMap<Node,Node> NodeMap = new HashMap<>();
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Node a = NodeMap.get(head);
        if(a==null) {
           a= new Node(head.val);
           NodeMap.put(head,a);
           a.next = copyRandomList(head.next);
           a.random = copyRandomList(head.random);
        }
        return a;
    }
}
