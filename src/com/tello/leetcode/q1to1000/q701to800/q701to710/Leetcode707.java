package com.tello.leetcode.q1to1000.q701to800.q701to710;

public class Leetcode707 {
    class Node{
        public Node(int val){
            this.val = val;
        }
        public Node prev;
        public Node next;
        public int val;
    }
    Node head;
    Node tail;
    int length;

    public Leetcode707() {
        head=null;
        tail=null;
        length=0;
    }

    public int get(int index) {
        if(index>=length){
            return -1;
        }
        Node temp = head;
        while(temp!=null){
            if(index--==0){
                return temp.val;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node temp = new Node(val);
        if(tail==null){
            tail = temp;
        }else{
            temp.next = head;
            head.prev = temp;
        }
        head = temp;
        length++;
    }

    public void addAtTail(int val) {
        Node temp = new Node(val);
        if(head==null){
            head = temp;
        }else{
            temp.prev = tail;
            tail.next = temp;
        }
        tail = temp;
        length++;
    }

    public void addAtIndex(int index, int val) {
        if(index>length){
            return;
        }
        if(index<=0){
            addAtHead(val);
            return;
        }
        if(index==length){
            addAtTail(val);
            return;
        }
        Node data = new Node(val);
        Node temp = head;
        while(temp!=null){
            if(index--==0){
                break;
            }
            temp = temp.next;
        }
        data.prev = temp.prev;
        temp.prev.next = data;
        data.next = temp;
        temp.prev = data;
        length++;
    }

    public void deleteAtIndex(int index) {
        if(index>=length){
            return;
        }
        if(index == 0){
            if(length==1){
                head = null;
                tail = null;
                length--;
                return;
            }
            head = head.next;
            head.prev = null;
            length--;
            return;
        }
        if(index == length-1){
            tail = tail.prev;
            tail.next = null;
            length--;
            return;
        }
        Node temp = head;
        while(temp!=null){
            if(index--==0){
                break;
            }
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        length--;
    }
}
