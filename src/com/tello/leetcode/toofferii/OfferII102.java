package com.tello.leetcode.toofferii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class OfferII102 {
    public int findTargetSumWays(int[] nums, int target) {
        return  find(nums,0,0,target);
    }

    public int find(int[] nums,int index,int nowValue,int target){
        if(index>nums.length-1){
            if(nowValue == target){
                return 1;
            }else{
                return 0;
            }
        }else{
            int num = nums[index++];
            System.out.println(nowValue+" "+num);
            int result1 = find(nums,index,nowValue+num,target);
            int result2 = find(nums,index,nowValue-num,target);
            return result1+result2;
        }
    }

    public static void main(String[] args) {
        int[] list = new int[]{1,1,1,1,1};
        LinkedList a = new LinkedList();
        System.out.println(new OfferII102().find(list,0,0,3));
    }
}
