package com.tello.leetcode.q1to1000.q1to100.q1to10;

//1. 两数之和
public class LeeCode01 {
	public static int[] twoSum(int[] nums, int target) {
		int[] a = new int[2];
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]>target) {
				continue;
			}
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					a[0]=i;
					a[1]=j;
					return a;
				}
			}
		}
		return a;
    }
	public static void main(String[] args) {
		int[] a = new int[]{10,1,5,3,8,0,2,7,11,15};
		int[] b = twoSum(a,9);
		System.out.println(b[0]+"  "+b[1]);
	}
}
