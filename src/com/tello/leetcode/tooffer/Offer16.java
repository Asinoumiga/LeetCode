package com.tello.leetcode.tooffer;

public class Offer16 {
//    public double myPow(double x, int n) {
//        if(x==0){
//            return 0;
//        }
//        if(n==0){
//            return 1;
//        }
//        double result = 1;
//        if(n<0){
//            x = 1/x;
//            n -= 2*n;
//        }
//        while (x>0){
//            result = result*x;
//            n--;
//        }
//        return result;
//    }
    public double myPow(double x, int n) {
        if(x==0){
            return 0;
        }
        if(n==1){
            return x;
        }else if(n==0){
            return 1;
        }
        double mid;
        double last;
        if(n<0){
            mid = myPow(1/x,-(n/2));
            last = myPow(1/x,-(n%2));
        }else{
            mid = myPow(x,n/2);
            last = myPow(x,n%2);
        }
        return mid*mid*last;
    }

    public static void main(String[] args) {
        System.out.println(-3%2);
    }
}
