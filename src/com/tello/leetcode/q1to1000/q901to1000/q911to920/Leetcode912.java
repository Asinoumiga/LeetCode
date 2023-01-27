package com.tello.leetcode.q1to1000.q901to1000.q911to920;

import java.util.Random;

public class Leetcode912 {
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }

    void quickSort(int[] nums,int pre,int back){
        if(pre>= back){
            return;
        }
        int random = pre+(int)(Math.random()*(back-pre+1));
        changePosition(nums,back,random);
        int left = pre;
        int right = back-1;
        while(left<=right){
            if(nums[right]<nums[back]){
                changePosition(nums,left,right);
                left++;
            }else{
                right--;
            }
        }
        changePosition(nums,back,left);
        quickSort(nums,pre,left-1);
        quickSort(nums,left+1,back);
    }

    void changePosition(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
