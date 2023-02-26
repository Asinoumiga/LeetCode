package com.tello.leetcode.q1to1000.q1to100.q81to90;

import com.tello.leetcode.common.ListNode;

public class Leetcode82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = new ListNode();
        temp.next = head;
        ListNode pre = temp;
        ListNode back = head;
        boolean isRepeat = false;
        while (back!=null){
            while (back.next!=null&&back.next.val == back.val){
                back = back.next;
                isRepeat = true;
            }
            if(isRepeat){
                pre.next = back.next;
            }else {
                pre = back;
            }
            back = back.next;
        }
        return temp.next;
    }
}
