package com.tello.leetcode.q1to1000.q101to200.q151to160;

import com.tello.leetcode.common.ListNode;

public class Leetcode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA!=null&&tempB!=null) {
            while (tempA != null && tempB != null) {
                if(tempA==tempB){
                    return tempA;
                }
                tempA = tempA.next;
                tempB = tempB.next;
            }
            if(tempA==null&&tempB==null){
                return null;
            }else if(tempA==null){
                tempA=headB;
            }else if(tempB==null){
                tempB=headA;
            }
        }
        return null;
    }
}
