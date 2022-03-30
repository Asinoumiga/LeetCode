package com.tello.tooffer;

public class Offer14I {
    public int cuttingRope(int n) {
        if(n<=3){
            return n-1;
        }
        int num = n/3;
        switch (n%3){
            case 0:
                return (int)Math.pow(3,num);
            case 1:
                return (int)Math.pow(3,num-1)*4;
            default:
                return (int)Math.pow(3,num)*2;
        }
    }
}
