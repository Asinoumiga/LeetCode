package com.tello.leetcode.q1to1000.q1to100.q11to20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//15. 三数之和
public class LeeCode15 {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> intListList = new ArrayList();
		if(nums.length<3) {
			return intListList;
		}
		Arrays.sort(nums);
//		HashSet<List<Integer>> intListSet = new HashSet<>();
		List<Integer> intList;
		int b;
		int c;
		for (int a = 0; a < nums.length-2; a++) {
			if(nums[a]>0) {
				break;
			}
			if(a>0&&nums[a]==nums[a-1]) {
				continue;
			}
			b = a+1;
			c = nums.length-1;
			while(b<c) {
				System.out.println("a:"+a+"b:"+b+"c:"+c);
				if(nums[a]+nums[b]+nums[c]==0) {
					intList = new ArrayList<>();
					intList.add(nums[a]);
					intList.add(nums[b]);
					intList.add(nums[c]);
					intListList.add(intList);
					while(b<c&&nums[c]==nums[--c]);
					while(b<c&&nums[b]==nums[++b]);
				}else if(nums[a]+nums[b]+nums[c]>0) {
					while(b<c&&nums[c]==nums[--c]);
				}else {
					while(b<c&&nums[b]==nums[++b]);
				}
			}
		}
 		return intListList;
    }
	
	public static void main(String[] args) {
		int[] a = new int[] {-1,0,1,2,-1,-4};
		List<List<Integer>> intListList = threeSum(a);
		for (int i = 0; i < intListList.size(); i++) {
			List<Integer> b = intListList.get(i);
			System.out.println(b.get(0)+" "+b.get(1)+" "+b.get(2));
		}
	}
}
