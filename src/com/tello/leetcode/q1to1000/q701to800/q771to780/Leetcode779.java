package com.tello.leetcode.q1to1000.q701to800.q771to780;

//779. µÚK¸öÓï·¨·ûºÅ
public class Leetcode779 {
    public int kthGrammar(int n, int k) {
        if(k==1)
            return 0;
        if(k==2)
            return 1;
        if(k<=1 << n-2){
            return kthGrammar(n-1,k);
        }else{
            if(n%2==0){
                return kthGrammar(n-1,(1<<n-1)-k+1)^1;
            }else{
                return kthGrammar(n-1,(1<<n-1)-k+1);
            }
        }

    }
}
