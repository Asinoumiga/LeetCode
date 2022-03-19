package com.tello.tooffer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//��ָ Offer 03. �������ظ�������
public class Offer03 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> aSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!aSet.add(nums[i])){
                return nums[i];
            }
        }
        return -1;
    }
}
