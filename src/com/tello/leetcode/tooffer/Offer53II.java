package com.tello.leetcode.tooffer;

public class Offer53II {
    public int missingNumber(int[] nums) {
        int pre = 0;
        int back = nums.length-1;
        int mid = -1;
        while(pre<back){
            mid = (pre+back)/2;
            if(nums[mid]>mid){
                back = mid;
            }else{
                pre = mid;
            }
        }
        return mid;
    }

}
