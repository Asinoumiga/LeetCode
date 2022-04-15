package com.tello.leetcode.q1to1000.q1to100.q1to10;

//4. 寻找两个正序数组的中位数
public class LeeCode04 {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {	
		int firstOut = 0;
		int firstNum = 0;
		int secondOut = 0;
		int secondNum = 0;
		int k = (nums1.length+nums2.length+1)/2-1;
		boolean isOu = (nums1.length+nums2.length)%2==0?true:false;
		int index = 0;
		while (k>0&&secondOut!=nums2.length&&firstOut!=nums1.length) {
			System.out.println("k:"+k);
			System.out.println("firstOut:"+firstOut);
			System.out.println("secondOut:"+secondOut);
			index = (k-1)/2+1;
			if(index+firstOut>nums1.length) {
				firstNum = nums1.length-firstOut;
			}else {
				firstNum = index;
			}
			if(index+secondOut>nums2.length) {
				secondNum = nums2.length-secondOut;
			}else {
				secondNum = index;
			}
			
			if(nums1[firstOut+firstNum-1]<nums2[secondOut+secondNum-1]) {
				firstOut = firstOut+firstNum;	
				k-= firstNum;
			}else {
				secondOut = secondOut+secondNum;
				k-= secondNum;
			}
		}
		System.out.println("k:"+k);
		System.out.println("firstOut:"+firstOut);
		System.out.println("secondOut:"+secondOut);
		if(k!=0) {
			if(nums1.length==firstOut) {
				secondOut+=k;
			}else {
				firstOut+=k;
			}
		}
		if(!isOu) {
			if(nums1.length==firstOut) {
				return (double) nums2[secondOut];
			}else if(nums2.length==secondOut) {
				return (double) nums1[firstOut];
			}else {
				return (double) nums1[firstOut]<nums2[secondOut]?nums1[firstOut]:nums2[secondOut];
			}
		}else {
			if(nums1.length==firstOut) {
				return (nums2[secondOut]+nums2[secondOut+1])/2.0;
			}else if(nums2.length==secondOut) {
				return (nums1[firstOut]+nums1[firstOut+1])/2.0;
			}else {
				if(nums1.length>firstOut+1&&nums1[firstOut+1]<nums2[secondOut]) {
					return (nums1[firstOut]+nums1[firstOut+1])/2.0;
				}else if(nums2.length>secondOut+1&&nums2[secondOut+1]<nums1[firstOut]) {
					return (nums2[secondOut]+nums2[secondOut+1])/2.0;
				}else {
					return (nums2[secondOut]+nums1[firstOut])/2.0;
				}
			}
		}


    }
	
	public static void main(String[] args) {
		int[] num1 = new int[] {1,2};
		int[] num2 = new int[] {1,2,3};
		System.out.println(findMedianSortedArrays(num1,num2));
	}
}
