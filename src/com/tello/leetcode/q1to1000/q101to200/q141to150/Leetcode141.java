package com.tello.leetcode.q1to1000.q101to200.q141to150;

import com.tello.leetcode.common.ListNode;

public class Leetcode141 {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
            if(fast!=null){
                fast = fast.next;
            }
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
