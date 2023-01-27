package com.tello.leetcode.q1to1000.q101to200.q141to150;

import com.tello.leetcode.common.ListNode;

public class Leetcode143 {
    ListNode now;
    boolean flag;
    public void reorderList(ListNode head) {
        now = head;
        flag=true;
        intoListNode(head);
    }
    void intoListNode(ListNode node){
        if(node==null){
            return;
        }
        intoListNode(node.next);
        if(flag) {
            ListNode temp = now.next;
            if (now != node) {
                now.next = node;
            } else {
                flag = false;
                now.next = null;
                return;
            }
            if (temp != node) {
                node.next = temp;
            }else{
                node.next = null;
                flag = false;
                return;
            }
            now = temp;
        }
    }
}
