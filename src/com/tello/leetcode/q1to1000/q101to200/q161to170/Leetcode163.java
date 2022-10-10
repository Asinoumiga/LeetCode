package com.tello.leetcode.q1to1000.q101to200.q161to170;

import java.util.ArrayList;
import java.util.List;

public class Leetcode163 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        if(nums.length==0){
            getRange(result,(long)lower-1,(long)upper+1);
            return result;
        }
        long pre;
        long back = (long) lower-1;
        for (int i = 0; i < nums.length; i++) {
            pre = back;
            back = (long)nums[i];
            getRange(result,pre,back);
        }
        pre = back;
        back = (long) upper+1;
        getRange(result,pre,back);
        return result;
    }

    void getRange(List<String> result,long pre,long back){
        if(back-pre<2){
            return;
        }else if(back-pre==2){
            result.add(String.valueOf(pre+1));
        }else{
            StringBuilder sb = new StringBuilder();
            sb.append(pre+1).append("->").append(back-1);
            result.add(sb.toString());
        }
    }


}
