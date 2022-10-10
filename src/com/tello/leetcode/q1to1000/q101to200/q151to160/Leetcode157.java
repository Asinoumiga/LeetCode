package com.tello.leetcode.q1to1000.q101to200.q151to160;

public class Leetcode157 {
    public int read4(char[] buf) {
        return 0;
    }

    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        int nowPoint = 0;
        char[] buf4 = new char[4];
        int readSize = read4(buf4);
        while (readSize>0&&n>nowPoint){
            for (int j=0; j < readSize&&nowPoint<n;nowPoint++,j++) {
                buf[nowPoint] = buf4[j];
            }
            readSize = read4(buf4);
        }
        return nowPoint;
    }
}
