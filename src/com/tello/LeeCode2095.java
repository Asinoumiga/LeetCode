package com.tello;

//2095. 删除链表的中间节点
public class LeeCode2095 {
	public ListNode deleteMiddle(ListNode head) {
		ListNode afterNode = head;
		ListNode middleNode = head;
		ListNode preMiddleNode = null;
		int i = 1;
		while(null != afterNode.next) {
			afterNode = afterNode.next;
			i++;
			if(i%2==0) {
				preMiddleNode = middleNode;
				middleNode = middleNode.next;
			}
		}
		if(preMiddleNode!=null) {
			preMiddleNode.next = middleNode.next;
		}else{
            return new ListNode();
        }
		
		return head;
    }
}
