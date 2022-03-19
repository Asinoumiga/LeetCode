package com.tello.leecode11to20;

import java.util.Arrays;

//16. 最接近的三数之和
public class LeeCode16 {
	public static int threeSumClosest(int[] nums, int target) {
		int near=50000;
		Arrays.sort(nums);
		for (int a = 0; a < nums.length-2; a++) {
			if(a>0&&nums[a]==nums[a-1]) {
				continue;
			}
			int b = nums.length-1;
			int c = a+1;
			while(c<b) {
				System.out.println(Math.abs(nums[a]+nums[b]+nums[c]-target));
				System.out.println(Math.abs(target-near));
				if(Math.abs(nums[a]+nums[b]+nums[c]-target)<Math.abs(target-near)) {
					near = nums[a]+nums[b]+nums[c];
				}
				if(nums[a]+nums[b]+nums[c]<target) {
					while(c<b&&nums[c]==nums[++c]);
				}else if(nums[a]+nums[b]+nums[c]>target) {
					while(c<b&&nums[b]==nums[--b]);
				}else {
					return nums[a]+nums[b]+nums[c];
				}
			}
		}
		return near;
    }
	public static void main(String[] args) {
		int[] nums = {-3,-2,-5,3,-4};
		System.out.println(threeSumClosest(nums,-1));
	}
}
