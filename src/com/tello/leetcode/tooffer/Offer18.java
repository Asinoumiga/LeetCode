package com.tello.leetcode.tooffer;

public class Offer18 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null){
            return null;
        }
        if(head.val == val){
            return head.next;
        }
        ListNode result = head;
        inDeleteNode(head,val);
        return result;
    }
    public void inDeleteNode(ListNode node,int val){
        if(node.next == null){
            return;
        }
        if(node.next.val == val){
            node.next = node.next.next;
            return;
        }
        inDeleteNode(node.next,val);
    }
}
