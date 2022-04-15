package com.tello.leetcode.q1to1000.q1to100.q21to30;

import com.tello.leetcode.q1to1000.q1to100.q11to20.ListNode;

//25. K 个一组翻转链表
public class LeeCode25 {
	static ListNode nextfirstNode;
	static ListNode result = new ListNode();
	static int nowDeap;
	public static ListNode reverseKGroup(ListNode head, int k) {
		ListNode forReturn = result;
		nextfirstNode = head;
		while(nextfirstNode!=null) {
			System.out.println("nextfirstNode"+nextfirstNode.val);
			nowDeap = 0;
			result = doRevert(nextfirstNode,k);
			System.out.println("A result"+result.val);
			if(nowDeap==k){
				result.next = nextfirstNode;
		    }
		}
//		if(nowDeap==0){
//	        result.next = null;
//	    }
		return forReturn.next;
    }
	public static ListNode doRevert(ListNode node, int k) {
		if(node == null) {
			nextfirstNode = null;
			return null;
		}
		nowDeap++;
		if(nowDeap == k) {
			System.out.println("B result"+result.val);

			result.next = node;
			nextfirstNode = node.next;
			return node;
		}
		ListNode nextNode = doRevert(node.next,k);
		if(nowDeap == k) {
			nextNode.next = node;			
		}else {
			node.next = nextNode;
		}
		return node;
	}
	
	public static void main(String[] args) {
//		ListNode A5 = new ListNode(5);
//		ListNode A4 = new ListNode(4,A5);
//		ListNode A3 = new ListNode(3,A4);
		ListNode A2 = new ListNode(2);
		ListNode A1 = new ListNode(1,A2);
		ListNode result = reverseKGroup(A1,2);
		while (result!=null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}
