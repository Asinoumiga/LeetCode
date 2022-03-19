package com.tello.tooffer;

import com.tello.ListNode;

public class Offer24 {
    public ListNode reverseList(ListNode head) {
        ListNode result = new ListNode();
        revertListNode(head,result).next = null;
        return result.next;
    }
    public ListNode revertListNode(ListNode a,ListNode result){
        if(a==null){
            return result;
        }
        ListNode b = revertListNode(a.next,result);
        b.next = a;
        return a;
    }

    public static void main(String[] args) {
        ListNode a5 = new ListNode(5);
        ListNode a4 = new ListNode(4,a5);
        ListNode a3 = new ListNode(3,a4);
        ListNode a2 = new ListNode(2,a3);
        ListNode a1 = new ListNode(1,a2);
        Offer24 offer24 = new Offer24();
        ListNode result = offer24.reverseList(a1);
        while (result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
}
