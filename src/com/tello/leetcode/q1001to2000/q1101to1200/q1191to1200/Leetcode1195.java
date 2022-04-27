package com.tello.leetcode.q1001to2000.q1101to1200.q1191to1200;

import java.util.function.IntConsumer;

public class Leetcode1195 {
    private int n;

    public Leetcode1195(int n) {
        this.n = n;
        num = 1;
    }
    private volatile Integer num;
    private Object object = new Object();

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        synchronized (object) {
            while (num<=n) {
                if (num%3==0&&num%5!=0) {
                    printFizz.run();
                    num++;
                    object.notifyAll();
                }else{
                    object.wait();
                }
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        synchronized (object) {
            while (num<=n) {
                if (num%5==0&&num%3!=0) {
                    printBuzz.run();
                    num++;
                    object.notifyAll();
                }else{
                    object.wait();
                }
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        synchronized (object) {
            while (num<=n) {
                if (num%5==0&&num%3==0) {
                    printFizzBuzz.run();
                    num++;
                    object.notifyAll();
                }else{
                    object.wait();
                }
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        synchronized (object) {
            while (num<=n) {
                if (num%5!=0&&num%3!=0) {
                    printNumber.accept(num);
                    num++;
                    object.notifyAll();
                }else{
                    object.wait();
                }
            }
        }
    }
}
