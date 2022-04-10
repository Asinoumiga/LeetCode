package com.tello.tooffer;

public class Offer49 {
    public int nthUglyNumber(int n) {
        int two = 1;
        int three = 1;
        int five = 1;
        int[] dp = new int[n+1];
        int now = 1;
        dp[1] = 1;
        while (now+1<=n){
            now++;
            dp[now] = Math.min(Math.min(dp[two]*2,dp[three]*3),dp[five]*5);
            if(dp[two]*2==dp[now]){
                two++;
            }
            if(dp[three]*3==dp[now]){
                three++;
            }
            if(dp[five]*5==dp[now]){
                five++;
            }
        }
        return dp[n];
    }
}
