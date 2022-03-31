package com.tello.tooffer;

public class Offer62 {
    public int lastRemaining(int n, int m) {
        int result = 0;
        for (int i = 2; i != n+1; i++) {
            result = (result+m)%i;
        }
        return result;
    }
}
