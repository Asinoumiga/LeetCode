package com.tello.leetcode.q1001to2000.q1101to1200.q1111to1120;

//1117. H2O Éú³É
public class Leetcode1117 {
    public Leetcode1117() {
        needOxygen = true;
        hydrogenNum = 1;
    }

    private volatile Boolean needOxygen;

    private volatile Integer hydrogenNum;

    private Object object = new Object();

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        synchronized (object){
            while (needOxygen) {
                object.wait();
            }
            // releaseHydrogen.run() outputs "H". Do not change or remove this line.
            releaseHydrogen.run();
            hydrogenNum++;
            if(hydrogenNum % 3==0&&!needOxygen){
                needOxygen = true;
                hydrogenNum++;
            }
            object.notifyAll();
        }

    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        synchronized (object) {
            while (!needOxygen) {
                object.wait();
            }
            // releaseOxygen.run() outputs "O". Do not change or remove this line.
            releaseOxygen.run();
            needOxygen = false;
            object.notifyAll();
        }
    }
}
