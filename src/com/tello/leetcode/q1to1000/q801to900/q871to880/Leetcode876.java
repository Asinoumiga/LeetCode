package com.tello.leetcode.q1to1000.q801to900.q871to880;

import com.tello.leetcode.common.ListNode;

public class Leetcode876 {
    public ListNode middleNode(ListNode head) {
        ListNode quick = head;
        while (quick!=null){
            quick = quick.next;
            if(quick!=null){
                head = head.next;
                quick = quick.next;
            }
        }
        return head;
    }
}
