package com.tello.leetcode.q1001to2000.q1101to1200.q1111to1120;

public class Leetcode1115 {
    private int n;

    public Leetcode1115(int n) {
        this.n = n;
        this.fooNow = true;

    }
    private volatile Boolean fooNow;
    public final Object object = new Object();

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            synchronized (object) {
                while (!fooNow){
                    object.wait();
                }
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                fooNow = false;
                object.notifyAll();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized (object) {
                while (fooNow){
                    object.wait();
                }
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                fooNow = true;
                object.notifyAll();
            }
        }
    }
}
