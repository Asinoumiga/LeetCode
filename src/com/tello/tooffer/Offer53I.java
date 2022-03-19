package com.tello.tooffer;

import java.util.Arrays;

public class Offer53I {
    public int search(int[] nums, int target) {
        int n = Arrays.binarySearch(nums,target);
        System.out.println(n);
        if(n<0){
            return 0;
        }
        int result =1;
        int pre = n;
        int end = n;
        while ((pre>0&&nums[--pre]==target)||(end<nums.length-1&&nums[++end]==target)){
            result++;
        }
        return result;
    }
}
