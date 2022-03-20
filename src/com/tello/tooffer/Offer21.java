package com.tello.tooffer;

public class Offer21 {
    public int[] exchange(int[] nums) {
        int pre = 0;
        int back = nums.length-1;
        while (pre<back){
            if(nums[back]%2==0){
                back--;
            }else if(nums[pre]%2==1){
                pre++;
            }else if(nums[pre]%2==0&&nums[back]%2==1){
                nums[back]+=nums[pre];
                nums[pre]=nums[back]-nums[pre];
                nums[back--]-=nums[pre++];
            }
        }
        return nums;
    }
}
