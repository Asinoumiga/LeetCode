package com.tello.leetcode.tooffer;

import java.util.Arrays;

//��ָ Offer 40. ��С��k����
public class Offer40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] result = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; ++i) {
            result[i] = arr[i];
        }
        return result;
    }
}
