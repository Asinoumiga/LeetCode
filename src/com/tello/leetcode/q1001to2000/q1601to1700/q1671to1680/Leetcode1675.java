package com.tello.leetcode.q1001to2000.q1601to1700.q1671to1680;

import java.util.TreeSet;

public class Leetcode1675 {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> numSet = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==1){
                numSet.add(nums[i]*2);
            }else{
                numSet.add(nums[i]);
            }
        }
        int temp = numSet.last()-numSet.first();
        while (temp>0&&numSet.last()%2==0){
            numSet.add(numSet.last()/2);
            numSet.remove(numSet.last());
            temp = Math.min(temp, numSet.last()-numSet.first());
        }
        return temp;
    }

    public static void main(String[] args) {
        TreeSet<Integer> numSet = new TreeSet<>();
        numSet.add(8);

        numSet.add(1);
        numSet.add(5);
        numSet.add(2);

        numSet.add(6);

        numSet.add(123);

        numSet.add(3);

        System.out.println(numSet.first());
        System.out.println(numSet.last());
    }
}
