package com.tello.leetcode.q1to1000.q701to800.q701to710;

public class Leetcode704 {
    public int search(int[] nums, int target) {
        int pre = 0;
        int back = nums.length;
        int mid;
        while (pre<back){
            mid = (pre+back)/2;
            System.out.println(pre+" "+mid+" "+back);
            if(nums[mid]<target){
                pre = mid+1;
            }else if(nums[mid]>target){
                back = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
