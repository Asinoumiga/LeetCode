package com.tello.leetcode.q1to1000.q1to100.q91to100;

import com.tello.leetcode.common.ListNode;

public class Leetcode92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode resultNode = new ListNode();
        resultNode.next = head;
        ListNode curNode = resultNode;
        for (int i = 1; i < left; i++) {
            curNode = curNode.next;
        }
        ListNode pre = curNode;
        ListNode tempNode = null;
        curNode = curNode.next;
        for (int i = left; i <= right; i++) {
            ListNode next = curNode.next;
            curNode.next = tempNode;
            tempNode = curNode;
            curNode = next;
        }
        pre.next.next = curNode;
        pre.next = tempNode;
        return resultNode.next;
    }

}
