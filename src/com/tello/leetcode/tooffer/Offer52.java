package com.tello.leetcode.tooffer;

public class Offer52 {
    public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA ==null&& headB== null){
            return null;
        }
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while (nodeA != nodeB){
            nodeA = (nodeA==null?headB:nodeA.next);
            nodeB = (nodeB==null?headA:nodeB.next);
        }
        return nodeA;
    }

}
