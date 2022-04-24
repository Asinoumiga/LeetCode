package com.tello.leetcode.q1001to2000.q1101to1200.q1111to1120;

public class Leetcode1114 {
    public Leetcode1114() {
    }
    public volatile Integer turn = new Integer(0);
    private final Object obj = new Object();

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized (obj) {
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            turn = 1;
            obj.notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (obj) {
            while (turn != 1) {
                obj.wait();
            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            turn = 2;
            obj.notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized (obj) {
            while (turn != 2) {
                obj.wait();
            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
            turn = 3;
        }
    }
}
