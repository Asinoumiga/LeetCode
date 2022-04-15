package com.tello.leetcode.tooffer;

//剑指 Offer 11. 旋转数组的最小数字
public class Offer11 {
    public int minArray(int[] numbers) {
        int pre = 0;
        int back = numbers.length-1;
        int mid;
        while (pre<back){
            mid = (pre+back)/2;
            if(numbers[pre]>numbers[mid]){
                back = mid-1;
            }else if(numbers[back]<numbers[mid]){
                pre = mid+1;
            }else{
                back--;
            }
        }
        return pre;
    }
}
