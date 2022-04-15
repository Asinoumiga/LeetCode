package com.tello.leetcode.tooffer;

//剑指 Offer 57. 和为s的两个数字
public class Offer57 {
    public int[] twoSum(int[] nums, int target) {
        int pre = 0;
        int back = binarySearch(nums,target);
        while (pre<back){
            if(nums[pre]+nums[back]>target){
                back--;
            }else if(nums[pre]+nums[back]<target){
                pre++;
            }else{
                return new int[]{nums[pre],nums[back]};
            }
        }
        return new int[0];
    }

    public int binarySearch(int[] nums,int target){
        int pre = 0;
        int back = nums.length-1;
        int mid;
        while (pre<back){
            mid = (pre+back)/2;
            if(nums[mid]>target){
                back=mid-1;
            }else if(nums[mid]<target){
                pre = mid+1;
            }else{
                return mid;
            }
        }
        return pre;
    }
}
