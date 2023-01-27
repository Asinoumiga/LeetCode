package com.tello.leetcode.q1to1000.q1to100.q31to40;

public class Leetcode35 {
    public int searchInsert(int[] nums, int target) {
        int pre = 0;
        int back = nums.length-1;
        int result = nums.length;
        while (pre<=back){
            int mid = (pre+back)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                pre = mid+1;
            }else{
                back = mid-1;
                result = mid;
            }
        }
        return result;
    }
}
