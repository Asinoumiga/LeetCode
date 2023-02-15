package com.tello.leetcode.q1to1000.q201to300.q201to210;

import com.tello.leetcode.common.ListNode;

public class Leetcode203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode pre = temp;
        while (head!=null){
            while (head!=null&&head.val==val){
                head =head.next;
            }
            pre.next = head;
        }
        return head.next;
    }
//    public ListNode removeElements(ListNode head, int val) {
//ListNode temp = new ListNode(0);
//    temp.next = head;
//    head = temp;
//        while (temp!=null){
//        while(temp.next!=null&&temp.next.val==val){
//            temp.next = temp.next.next;
//        }
//        temp = temp.next;
//    }
//        return head.next;
//    }
}
