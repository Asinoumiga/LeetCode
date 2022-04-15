package com.tello.leetcode.tooffer;

public class Offer45 {
    public String minNumber(int[] nums) {
        String[] stringList = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            stringList[i] = String.valueOf(nums[i]);
        }
        sortString(stringList,0,stringList.length-1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringList.length; i++) {
            sb.append(stringList[i]);
        }
//        int min;
//        int minPos;
//        for (int i = 0; i < nums.length; i++) {
//            min = nums[i];
//            minPos = i;
//            for (int j = i; j < nums.length; j++) {
//                if(isSmaller(nums[j],min)){
//                    min = nums[j];
//                    minPos = j;
//                }
//            }
//            nums[minPos] = nums[i];
//            nums[i] = min;
//            sb.append(min);
//        }
        return sb.toString();
    }

    void sortString(String[] target , int pre , int back){
        if(pre>=back) return;
        int i = pre ,j = back;
        String temp = target[pre];
        while (i<j){
            while((target[j]+target[pre]).compareTo(target[pre]+target[j])>=0&&i<j){
                j--;
            }
            while((target[i]+target[pre]).compareTo(target[pre]+target[i])<=0&&i<j){
                i++;
            }
            temp = target[i];
            target[i] = target[j];
            target[j] = temp;
        }
        target[i] = target[pre];
        target[pre] = temp;
        sortString(target,pre,i-1);
        sortString(target,i+1,back);
    }

    public boolean isSmaller(int A,int B){
        String aString = String.valueOf(A)+String.valueOf(B);
        String bString = String.valueOf(B)+String.valueOf(A);
        if(aString.compareTo(bString)>0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Offer45 offer45 = new Offer45();
        System.out.println(offer45.isSmaller(22,2014));
    }


}
