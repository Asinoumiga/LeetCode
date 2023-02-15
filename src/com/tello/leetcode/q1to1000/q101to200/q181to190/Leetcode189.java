package com.tello.leetcode.q1to1000.q101to200.q181to190;

public class Leetcode189 {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        turn(nums, 0, length - 1);
        turn(nums, 0, k - 1);
        turn(nums, k, length - 1);
    }
    private void turn(int[] nums, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
    }
}
