package com.tello.leetcode.q1to1000.q1to100.q81to90;

import com.tello.leetcode.common.ListNode;

public class Leetcode86 {
    public ListNode partition(ListNode head, int x) {
        ListNode pre = new ListNode();
        ListNode preBack = pre;
        ListNode back = new ListNode();
        ListNode backBack = back;
        while (head!=null){
            if(head.val<x){
                preBack.next = head;
                preBack = head;
            }else{
                backBack.next = head;
                backBack = head;
            }
            head = head.next;
        }
        backBack.next = null;
        preBack.next = back.next;
        return pre.next;
    }

    public static void main(String[] args) {
//        ListNode a = new ListNode(5);
//        ListNode b = new ListNode(2,a);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(2,c);
        ListNode result = new Leetcode86().partition(d,2);
        while (result!=null){
            System.out.println(result.val);
            result= result.next;
        }
    }
}
