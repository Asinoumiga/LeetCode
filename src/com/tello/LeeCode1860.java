package com.tello;

import java.util.Iterator;
//1860. 增长的内存泄露
public class LeeCode1860 {
	    public static int[] memLeak(int memory1, int memory2) {
	    	int nowNum=1;
	    	while (memory1>=nowNum||memory2>=nowNum) {
				if(memory1>=memory2) {
					memory1-=nowNum;
				}else {
					memory2-=nowNum;
				}
				nowNum++;
			}
	    	return new int[]{nowNum,memory1,memory2};
	    }
	   
	    public static void main(String[] args) {
			System.out.println();
			int[] result = memLeak(8,11);
			for (int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
		}
}
