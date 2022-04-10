package com.tello.tooffer;

import java.util.*;

public class Offer59II {
    Queue<Integer> queue;
    Deque<Integer> maxQueue;

    public Offer59II() {
        queue = new LinkedList<>();
        maxQueue = new LinkedList<>();
    }

    public int max_value() {
        if(maxQueue.isEmpty()){
            return -1;
        }
        return maxQueue.peek();
    }

    public void push_back(int value) {
        queue.offer(value);
        if(maxQueue.size()==0){
            maxQueue.offer(value);
        }else{
            while (!maxQueue.isEmpty()&&maxQueue.peekLast()<value){
                maxQueue.pollLast();
            }
            maxQueue.offer(value);
        }
    }

    public int pop_front() {
        if(queue.isEmpty()){
            return -1;
        }
        if(queue.peek().equals(maxQueue.peek())){
            maxQueue.poll();
        }
        return queue.poll();
    }

}
