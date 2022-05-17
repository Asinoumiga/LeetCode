package com.tello.leetcode.toofferii;

import com.tello.leetcode.common.ListNode;

public class OfferII24 {
    ListNode result;
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode last = reverse(head);
        last.next = null;
        return result;
    }

    public ListNode reverse(ListNode node){
        if(node == null){
            return null;
        }
        ListNode next = reverse(node.next);
        if(next==null){
            result = node;
        } else {
            next.next = node;
        }
        return node;
    }
}
