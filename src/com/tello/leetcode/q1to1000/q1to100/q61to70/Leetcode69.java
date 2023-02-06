package com.tello.leetcode.q1to1000.q1to100.q61to70;

public class Leetcode69 {
    public int mySqrt(int x) {
        int pre = 0;
        int back = x;
        int result = -1;
        while (pre<=back){
            int mid = (pre+back)/2;
            if((long)mid*mid<=x){
                result = mid;
                pre = mid+1;
            }else{
                back = mid-1;
            }
        }
        return back;
    }
}
