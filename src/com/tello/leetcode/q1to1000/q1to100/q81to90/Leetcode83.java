package com.tello.leetcode.q1to1000.q1to100.q81to90;

import com.tello.leetcode.common.ListNode;

public class Leetcode83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = head;
        ListNode back = head;
        while (back!=null){
            do {
                back = back.next;
            }while (back!=null&&back.val==pre.val);
            pre.next = back;
            pre = back;
        }
        return head;
    }
}
