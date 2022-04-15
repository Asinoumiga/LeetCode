package com.tello.leetcode.q1to1000.q1to100.q11to20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeeCode18 {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> resultList = new ArrayList<>();
		if(nums.length<4) {
			return resultList;
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-3; i++) {
			if(i>0&&nums[i]==nums[i-1]) {
				continue;
			}
			if(target>=0&&nums[i]>target) {
				break;
			}
			for (int j = nums.length-1; j > i; j--) {
				if(j<nums.length-1&&nums[j]==nums[j+1]) {
					continue;
				}
				if(target<=0&&nums[j]<target) {
					break;
				}
				int x = i+1;
				int y = j-1;
				while(x<y) {
					if(nums[i]+nums[j]+nums[x]+nums[y]==target) {
						resultList.add(Arrays.asList(nums[i], nums[j], nums[x], nums[y]));
						while(x<y&&nums[x]==nums[++x]);
						while(x<y&&nums[y]==nums[--y]);
					}else if(nums[i]+nums[j]+nums[x]+nums[y]<target) {
						while(x<y&&nums[x]==nums[++x]);
					}else if(nums[i]+nums[j]+nums[x]+nums[y]>target) {
						while(x<y&&nums[y]==nums[--y]);
					}
				}
			}
		}
		return resultList;
    }
	public static void main(String[] args) {
		int[] a = new int[] {1,-2,-5,-4,-3,3,3,5};
		List<List<Integer>> intListList = fourSum(a,-11);
		for (int i = 0; i < intListList.size(); i++) {
			List<Integer> b = intListList.get(i);
			System.out.println(b.get(0)+" "+b.get(1)+" "+b.get(2)+" "+b.get(3));
		}
				
	}
}
