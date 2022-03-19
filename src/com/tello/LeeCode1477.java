package com.tello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class LeeCode1477 {
	public static int minSumOfLengths(int[] arr, int target) {
		int result = -1;
		int head = 0;
		int last = 0;
		ArrayList<Integer[]> lengthList = new ArrayList<>(); 
		int sum = 0;
		while(head<arr.length) {
			sum+=arr[head];
			if(sum==target) {
				System.out.println(head-last+1);
				Integer[] a= new Integer[] {head,head-last+1};
				lengthList.add(a);
				if(last==head) {
					last++;
					head++;
				}else {
					last++;
					head=last;
				}
				sum=0;
			}else if(sum > target) {
				if(arr[head]>target) {
					last=++head;
				}else {
					if(last==head) {
						last++;
						head++;
					}else {
						last++;
						head=last;
					}
				}
				sum=0;
			}else{
				head++;
			}
			System.out.println("last:"+last);
			System.out.println("head:"+head);
		}
		System.out.println(lengthList.size());
		if(lengthList.size()>=2) {
//			for()
		}
		return result;
    }
	public static void main(String[] args) {
		int[] a  = new int[] {3,2,2,4,3};
		int result = minSumOfLengths(a,3);
		System.out.println(result);
	}
}
