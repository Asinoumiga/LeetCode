package com.tello;

import java.util.ArrayList;
import java.util.Iterator;

//188. 买卖股票的最佳时机 IV
public class LeeCode188 {
    public int maxProfit(int k, int[] prices) {
    	if(prices.length==0) {
    		return 0;
    	}
    	ArrayList<Integer[]> transation = new ArrayList<>();
    	transation.add(new Integer[] {-prices[0],0});
		for(int i=1;i<=k;i++) {
			Integer[] buyAndSell = new Integer[] {-prices[0],0};
			transation.add(buyAndSell);
		}
		for (int i = 0; i < prices.length; i++) {
			for(int j=1;j<=k;j++) {
//				transation.get(k)[0] = Math.max(transation.get(k), j);
			}
		}
		return 0;
    }
	
	public static void main(String[] args) {
		int[] i = new int[] {7,1,5,3,6,4};
//		System.out.println(maxProfit(i));
	}
}
