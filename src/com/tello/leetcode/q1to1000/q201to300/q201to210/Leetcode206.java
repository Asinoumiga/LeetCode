package com.tello.leetcode.q1to1000.q201to300.q201to210;

import com.tello.leetcode.common.ListNode;

public class Leetcode206 {
    ListNode preNode;
    public ListNode reverseList(ListNode head) {
        preNode = new ListNode();
        doReverse(head);
        if(head!=null){
            head.next = null;
        }
        return preNode.next;
    }

    public void doReverse(ListNode node){
        if(node==null){
            return;
        }
        ListNode next = node.next;
        doReverse(node);
        if(next==null){
            preNode.next = node;
        }else{
            next.next = node;
        }
    }
}
