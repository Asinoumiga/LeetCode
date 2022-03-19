package com.tello.leecode21to30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//23. 合并K个升序链表
public class LeeCode23 {
	public ListNode mergeKLists(ListNode[] lists) {
		ListNode result = new ListNode(0);
		ListNode forAdd = result;
		PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
			public int compare(ListNode node1,ListNode node2) {
				return node1.val - node2.val;
			}
		});
		for (int i = 0; i < lists.length; i++) {
			ListNode node = lists[i];
			while (node!= null) {
				queue.add(node);
				node=node.next;
			}
		}
		while(queue.size()>0) {
			forAdd.next = queue.poll();
			forAdd = forAdd.next;
		}
		forAdd.next=null;
		return result.next;
    }
}
