package com.tello.leetcode.q1to1000.q1to100.q31to40;

public class Leetcode33 {
    public int search(int[] nums, int target) {
        int pre = 0;
        int back = nums.length-1;
        int mid;
        while (pre<=back){
            mid = (pre+back)/2;

            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < nums[back]){
                if(nums[mid] < target && target <= nums[back])
                    pre = mid+1;
                else
                    back = mid-1;
            }else{
                if(nums[pre] <= target && target < nums[mid])
                    back = mid-1;
                else
                    pre = mid+1;
            }
        }
        return -1;
    }
}
