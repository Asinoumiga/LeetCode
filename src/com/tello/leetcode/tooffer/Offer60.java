package com.tello.leetcode.tooffer;

//剑指 Offer 60. n个骰子的点数
public class Offer60 {
//    public double[] dicesProbability(int n) {
//        double[] result = new double[5*n+1];
//        int now = 0;
//        if(n==1){
//            while (now<6){
//                result[now++] = 1/6;
//            }
//        }
//        int up = 1;
//        double below = Math.pow(6,n);
//        while (now<5*n/2+1){
//            result[now] = up/below;
//            up+=(n-1+now*(n-2));
//            now++;
//        }
//        int turnNow;
//        if(n%2==0){
//             turnNow = now-2;
//        }else {
//            turnNow = now-1;
//        }
//        while (now<5*n+1){
//            result[now++] = result[turnNow--];
//        }
//        return result;
//    }
public double[] dicesProbability(int n){
    int[] dpInit = {1, 1, 1, 1, 1, 1};
    double[] result = new double[5*n + 1];
    int[] tmp;
    if(n == 1){
        tmp = dpInit;
    }else{
        tmp = dpCal(dpInit, 2, n);
    }
    for (int i = 0; i < result.length; i++) {
        result[i] = tmp[i] / Math.pow(6,n);
    }
    return result;
}

    private int[] dpCal(int[] preDp, int k, int n){
        int[] posDp = new int[k*5 + 1];
        for (int i = 0; i <= posDp.length/2; i++) {
            int flag = 6;
            int j = i;
            //posDp[i] = 0;
            while(flag > 0 && j >=0){
                posDp[i] = posDp[i] + preDp[j];
                j--;
                flag--;
            }
        }
        int a = 0, b =posDp.length-1;
        while(a < b){
            posDp[b] = posDp[a];
            b--;
            a++;
        }
        if(k != n){
            posDp = dpCal(posDp, k+1, n);
        }
        return posDp;
    }
}
