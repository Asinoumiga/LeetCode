package com.tello.tooffer;

//剑指 Offer 15. 二进制中1的个数
public class Offer15 {
    public int hammingWeight(int n) {
        int result = 0;
        while (n!=0){
            n &= n - 1;
            result++;
        }
        return result;
    }
}
