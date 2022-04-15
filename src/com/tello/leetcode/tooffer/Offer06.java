package com.tello.leetcode.tooffer;

import com.tello.ListNode;

import java.util.ArrayList;
import java.util.List;
//剑指 Offer 06. 从尾到头打印链表
public class Offer06 {
    public int[] reversePrint(ListNode head) {
        List<Integer> aList = new ArrayList<>();
        paintListNode(aList,head);
        int[] nodeList = new int[aList.size()];
        for (int i = 0; i < aList.size(); i++) {
            nodeList[i] = aList.get(i);
        }
        return nodeList;
    }

    public void paintListNode(List<Integer> aList,ListNode a){
        if(a==null){
            return;
        }
        paintListNode(aList,a.next);
        aList.add(a.val);
    }
}
