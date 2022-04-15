package com.tello.leetcode.tooffer;

//剑指 Offer 63. 股票的最大利润
public class Offer63 {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int maxResult = 0;
        int preMin=prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]-preMin>maxResult){
                maxResult=prices[i]-preMin;
            }else if(prices[i]<preMin){
                preMin = prices[i];
            }
        }
        return maxResult;
    }
}
