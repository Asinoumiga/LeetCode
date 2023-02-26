package com.tello.leetcode.q1to1000.q201to300.q271to280;

public class Leetcode278 {
    boolean isBadVersion(int version){
        return true;
    }

    public int firstBadVersion(int n) {
        int pre = 0;
        int back = n;
        int mid;
        while (pre<back){
            mid = (pre+back)/2;
            if(isBadVersion(mid)){
                back = mid;
            }else{
                pre = mid+1;
            }
        }
        return back;
    }
}
