package com.tello.leecode1to10;

import com.tello.ListNode;

//2. 两数相加
public class LeeCode02 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int isUp = 0;
		ListNode l4 = new ListNode();
		ListNode l3=l4;
		while (l1!=null||l2!=null||isUp!=0) {
			l3.next = new ListNode();
			if(l1!=null) {
				l3.next.val += l1.val;
				l1 = l1.next;
			}
			if(l2!=null) {
				l3.next.val += l2.val;
				l2 = l2.next;
			}
			if(isUp!=0) {
				l3.next.val += isUp;
			}
			if(l3.next.val>9) {
				isUp = 1;
				l3.next.val -=10;
			}else {
				isUp = 0;
			}
            l3 = l3.next;
		}
		return l4.next;
    }
}
