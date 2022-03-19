package com.tello;

//122. 买卖股票的最佳时机 II
public class LeeCode122 {
	public static int maxProfit(int[] prices) {
		if(prices.length==0||prices.length==1) {
			return 0;
		}
		int i = 1;
		int profit = 0;
		while(i<prices.length) {
			if(prices[i]>=prices[i-1]) {
				profit+=(prices[i]-prices[i-1]);
			}
			i++;
		}
		
		return profit;
    }
	
	public static void main(String[] args) {
		int[] i = new int[] {7,1,5,3,6,4};
		System.out.println(maxProfit(i));
	}
}
