package com.tello.tooffer;

//��ָ Offer 15. ��������1�ĸ���
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
