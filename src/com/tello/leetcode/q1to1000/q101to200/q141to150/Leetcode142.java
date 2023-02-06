package com.tello.leetcode.q1to1000.q101to200.q141to150;

import com.tello.leetcode.common.ListNode;

public class Leetcode142 {
    public ListNode detectCycle(ListNode head) {
        ListNode quick = head;
        ListNode slow = head;
        while (quick!=null&&quick.next!=null){
            quick =quick.next.next;
            slow = slow.next;
            if(quick == slow){
                System.out.println(quick.val);
                quick = head;
                while (true){
                    if(quick == slow) {
                        return quick;
                    }
                    quick=quick.next;
                    slow=slow.next;
                }
            }
        }
        return null;
    }
}
