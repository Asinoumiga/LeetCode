package com.tello.leetcode.tooffer;

//��ָ Offer 22. �����е�����k���ڵ�
public class Offer22 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode back = head;
        for (int i = 0; i < k; i++) {
            if(back!=null){
                back = back.next;
            }
        }
        while (back!=null){
            back = back.next;
            head = head.next;
        }
        return head;
    }
}
