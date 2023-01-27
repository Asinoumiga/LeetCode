package com.tello.leetcode.q1to1000.q601to700.q691to700;

import java.util.Arrays;

public class Leetcode698 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total+=nums[i];
        }
        if(total%k!=0){
            return false;
        }
        int target = total/k;
        int[] tong = new int[k];
        Arrays.sort(nums);
        return intoTong(nums,nums.length-1,tong,target);
    }

    boolean intoTong(int[] nums,int now,int[] tong,int target){
        if(now<0){
            return true;
        }
        for (int i = 0; i < tong.length; i++) {
            if(i>0&&tong[i]==tong[i-1]){
                continue;
            }
            if(nums[now]+tong[i]<=target){
                tong[i] += nums[now];
                boolean result = intoTong(nums,now-1,tong,target);
                if(result){
                   return true;
                }else
                tong[i] -= nums[now];
            }
        }
        return false;
    }
}
