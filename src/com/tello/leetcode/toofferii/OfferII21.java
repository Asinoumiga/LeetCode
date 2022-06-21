package com.tello.leetcode.toofferii;

import com.tello.leetcode.common.ListNode;

public class OfferII21 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = head;
        ListNode back = head;
        for (int i = 0; i < n; i++) {
            if(back!=null){
                back = back.next;
            }
        }
        if(back==null){
            return head.next;
        }
        while (back.next!=null){
            pre = pre.next;
            back = back.next;
        }
        pre.next = pre.next.next;
        return head;
    }


}
