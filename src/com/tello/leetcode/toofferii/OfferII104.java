package com.tello.leetcode.toofferii;

import java.util.Arrays;

public class OfferII104 {
//    public int combinationSum4(int[] nums, int target) {
//        µü´ú
//        int result = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(target-nums[i]==0){
//                result++;
//            }else if(target-nums[i]>0){
//                result+=combinationSum4(nums,target-nums[i]);
//                System.out.println(target+" "+result);
//            }else{
//                continue;
//            }
//        }
//        return result;
//    }
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        int[] result = new int[target+1];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<=target){
                result[nums[i]] = 1;
            }
        }
        for (int i = 0; i < target+1; i++) {
            for (int j = 0; j < nums.length; j++){
                if(i>=nums[j]){
                    result[i] += result[i-nums[j]];
                }else{
                    break;
                }
            }
        }
        return result[target];
    }
}
