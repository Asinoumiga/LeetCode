package com.tello.leetcode.q1to1000.q1to100.q11to20;

//19. 删除链表的倒数第 N 个结点
public class LeeCode19 {
	static int deap = 0;
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		remove(head, n);
		if(deap==n) {
			return head.next;
		}
		return head;
    }
	public static int remove(ListNode node, int n ) {
		if(node == null) {
			return 0;
		}
		deap++;
		int last = remove(node.next, n);
		if(last++==n) {
			System.out.println("in---"+n);
			node.next = node.next.next;
		}
		return last;
	}
	
	public static void main(String[] args) {
//		ListNode A5 = new ListNode(5);
//		ListNode A4 = new ListNode(4,A5);
//		ListNode A3 = new ListNode(3,A4);
//		ListNode A2 = new ListNode(2,A3);
		ListNode A1 = new ListNode(1,null);
		ListNode result = removeNthFromEnd(A1,1);
		while (result!=null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}
