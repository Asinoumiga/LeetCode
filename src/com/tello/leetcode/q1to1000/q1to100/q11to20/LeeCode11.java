package com.tello.leetcode.q1to1000.q1to100.q11to20;

//11. 盛最多水的容器
public class LeeCode11 {
	public static int maxArea(int[] height) {
		int begin = 0;
		int end = height.length-1;
		int maxWater = 0;
		while(end>begin) {
			if(height[end]>=height[begin]) {
				if(height[begin]*(end-begin)>maxWater) {
					maxWater = height[begin]*(end-begin);
					System.out.println("begin:"+begin+"end:"+end+"maxWater:"+maxWater);
				}
				begin++;
			}else {
				if(height[end]*(end-begin)>maxWater) {
					maxWater = height[end]*(end-begin);
					System.out.println("begin:"+begin+"end:"+end+"maxWater:"+maxWater);
				}
				end--;
			}
		}
		
		return maxWater;
    }
	
	public static void main(String[] args) {
		int[] height = new int[] {1,0};
		System.out.println(maxArea(height));
	}
}
