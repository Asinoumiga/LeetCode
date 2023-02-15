package com.tello.leetcode.q1to1000.q201to300.q201to210;

public class Leetcode209 {
    public int minSubArrayLen(int target, int[] nums) {
        int result = 0;
        int pre = 0;
        int back = 0;
        while (back<nums.length){
            target-=nums[back];
            back++;
            while (target<=0){
                if(result==0||result>back-pre){
                    result = back-pre;
                }
                target+=nums[pre];
                pre++;
            }
            System.out.println("pre: "+pre+" back: "+back);
            System.out.println("result: "+result);
        }
        return result;
    }
}
