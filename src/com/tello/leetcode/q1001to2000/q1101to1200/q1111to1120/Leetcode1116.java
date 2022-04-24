package com.tello.leetcode.q1001to2000.q1101to1200.q1111to1120;

import java.util.function.IntConsumer;

public class Leetcode1116 {
    private int n;

    public Leetcode1116(int n) {
        this.n = n;
        zero = true;
        even = true;
    }

    private volatile Boolean zero;
    private volatile Boolean even;
    public Object obj = new Object();

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        synchronized (obj){
            for (int i = 0; i < n; i++) {
                while (!zero) {
                    obj.wait();
                }
                printNumber.accept(0);
                zero = false;
                obj.notifyAll();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        synchronized (obj){
            for (int i = 2; i <= n; i=i+2) {
                while (zero || !even) {
                    obj.wait();
                }
                printNumber.accept(i);
                zero = true;
                even = false;
                obj.notifyAll();
            }
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        synchronized (obj){
            for (int i = 1; i <= n; i=i+2) {
                while (zero || even){
                    obj.wait();
                }
                printNumber.accept(i);
                zero = true;
                even = true;
                obj.notifyAll();
            }
        }
    }
}
