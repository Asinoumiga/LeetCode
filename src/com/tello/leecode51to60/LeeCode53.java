package com.tello.leecode51to60;

//53. 最大子数组和
public class LeeCode53 {
	public static int maxSubArray(int[] nums) {
		int maxValue = nums[0];
		int nowValue = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if(nowValue<=0) {
				if(nums[i]>maxValue) {
					maxValue = nums[i];
					nowValue = nums[i];
				}else {
					nowValue = nums[i];
				}
			}else {
				if(nowValue+nums[i]>maxValue) {
					maxValue = nowValue+nums[i];
					nowValue = nowValue+nums[i];
				}else if(nowValue+nums[i]>0){
					nowValue = nowValue+nums[i];
				}else {
					if(nums[i]>maxValue) {
						maxValue = nums[i];
						nowValue = nums[i];
					}else {
						nowValue = nowValue+nums[i];						
					}
				}
			}
			System.out.println("nowValue:"+nowValue);
			System.out.println("maxValue:"+maxValue);
		}
		return maxValue;
    }
	
	public static void main(String[] args) {
		int[] a = new int[] {8,-19,5,-4,20};
		System.out.println(maxSubArray(a));
	}
}
