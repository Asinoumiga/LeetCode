package com.tello.leetcode.q1to1000.q1to100.q61to70;

import com.tello.leetcode.common.ListNode;

public class Leetcode61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        int deep = 1;
        ListNode temp = head;
        while (temp.next!=null){
            temp = temp.next;
            deep++;
        }
        k = k%deep;
        int mid=deep-k;
        temp.next = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}
