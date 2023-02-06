package com.tello.leetcode.q1to1000.q101to200.q161to170;

public class Leecode167 {
    public int[] twoSum(int[] numbers, int target) {
        int pre = 0;
        int back = numbers.length-1;
        while (pre<back){
            if(numbers[pre]+numbers[back]>target){
                back--;
            }else if(numbers[pre]+numbers[back]<target){
                pre++;
            }else{
                return new int[]{pre,back};
            }
        }
        return new int[]{pre,back};
    }
}
