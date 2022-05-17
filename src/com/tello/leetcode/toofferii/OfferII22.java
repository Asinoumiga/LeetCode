package com.tello.leetcode.toofferii;

import com.tello.leetcode.common.ListNode;

public class OfferII22 {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;

        do {
            fast = fast.next;
            if(fast == null){
                return null;
            }
            fast = fast.next;
            slow = slow.next;
        } while (fast!=null&&fast!=slow);

        if(fast == null){
            return null;
        }
        ListNode result = head;

        while (result!=fast){
            result = result.next;
            fast = fast.next;
        }
        return result;
    }
}
