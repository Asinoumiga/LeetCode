package com.tello.leetcode.tooffer;

//½£Ö¸ Offer 46. °ÑÊý×Ö·­Òë³É×Ö·û´®
public class Offer46 {
    public int translateNum(int num) {
        int[] result = new int[String.valueOf(num).length()+1];
        result[0] = 1;
        result[1] = 1;
        int now = 2;
        while (num>9){
            int checkNum = num%100;
            if(checkNum<=25&&(checkNum/10==1||checkNum/10==2)){
                result[now] = result[now-1]+result[now-2];
            }else{
                result[now] = result[now-1];
            }
            num = num/10;
            now++;
        }
        return result[result.length-1];
    }
}
