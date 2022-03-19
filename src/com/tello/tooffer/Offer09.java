package com.tello.tooffer;

import java.util.Stack;

public class Offer09 {
    class CQueue {

        Stack toAddStack;
        Stack toRemoveStack;

        public CQueue() {
            toAddStack = new Stack();
            toRemoveStack = new Stack();
        }

        public void appendTail(int value) {
            toAddStack.push(value);
        }

        public int deleteHead() {
            if(toRemoveStack.isEmpty()){
                while (!toAddStack.isEmpty()){
                    toRemoveStack.push(toAddStack.pop());
                }
            }
            if(toRemoveStack.isEmpty()){
                return -1;
            }
            return (Integer) toRemoveStack.pop();

        }
    }
}
