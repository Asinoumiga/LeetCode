package com.tello.leetcode.q1to1000.q201to300.q231to240;

import com.tello.leetcode.common.ListNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Leetcode234 {
//    ListNode pre;
//    int deep=0;
//    int now=0;
//
//    public boolean isPalindrome(ListNode head) {
//        pre = head;
//        boolean a = check(head);
//        return a;
//    }
//
//    public boolean check(ListNode node){
//        if(node==null){
//            return true;
//        }
//        deep++;
//        if(!check(node.next)){
//            return false;
//        }
//        if(now >= deep/2){
//            return true;
//        }
//        if(pre.val != node.val){
//            return false;
//        }
//        now++;
//        System.out.println("now:"+now+" deep:"+deep);
//        pre = pre.next;
//        return true;
//    }

    public boolean isPalindrome(ListNode head) {
        Deque<Integer> deque = new LinkedList<>();
        while(head != null) {
            deque.offer(head.val);
            head = head.next;
        }
        while(!deque.isEmpty()) {
            if(deque.size()==1) return true;
            if(deque.pollFirst() != deque.pollLast()) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        Leetcode234 leetcode234 = new Leetcode234();
        System.out.println(leetcode234.isPalindrome(a));
    }

}
