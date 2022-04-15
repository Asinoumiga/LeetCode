package com.tello.leetcode.tooffer;

//��ָ Offer 56 - I. ���������ֳ��ֵĴ���
public class Offer56I {
    public int[] singleNumbers(int[] nums) {
        int a = 0;
        for (int i:nums) {
            a^=i;
        }
        int temp = 1;
        while ((a&temp)==0){
            temp<<=1;
        }
        int left = 0;
        int right = 0;
        for (int i:nums) {
            if((i&temp)==0){
                left^=i;
            }else{
                right^=i;
            }
        }
        return new int[]{left,right};
    }
}
