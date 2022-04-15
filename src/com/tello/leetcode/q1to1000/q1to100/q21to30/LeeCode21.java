package com.tello.leetcode.q1to1000.q1to100.q21to30;

//21. 合并两个有序链表
public class LeeCode21 {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode result = new ListNode();
		while(list1!=null&&list2!=null) {
			if(list1 == null) {
				result.next = list2;
				break;
			}
			if(list2 == null) {
				result.next = list2;
				break;
			}
			if(list1.val>=list2.val) {
				result.next = list1;
				list1 = list1.next;
			}else {
				result.next = list2;
				list2 = list2.next;
			}
			
		}
		return result.next;
    }
}
