package com.tello.leetcode.q1to1000.q1to100.q81to90;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Leetcode84 {
    public int largestRectangleArea(int[] heights) {
//        int max = 0;
//        List<int[]> cacheList = new ArrayList<>();
//        for (int i = 0; i < heights.length; i++) {
//            if(heights[i]==0){
//                cacheList.clear();
//                continue;
//            }else{
//                if(cacheList.size()==0){
//                    cacheList.add(new int[]{i,heights[i]});
//                }else{
//                    for (int j = cacheList.size()-1; j >=0 ; j--) {
//                        if(cacheList.get(j)[1]>heights[i]){
//                            if(j==0){
//                                int[] temp = cacheList.get(j);
//                                temp[1] = heights[i];
//                                cacheList.set(0,temp);
//                            }else{
//                                cacheList.remove(j);
//                            }
//                        }else{
//                            cacheList.add(new int[]{i,heights[i]});
//                            break;
//                        }
//                    }
//                }
//            }
//            for (int j = 0; j < cacheList.size(); j++) {
//                int temp = cacheList.get(j)[1] * (cacheList.get(cacheList.size() - 1)[0] - cacheList.get(j)[0]+1);
//                if (temp > max) {
//                    max = temp;
//                }
//            }
//        }
//        return max;
        int len = heights.length;
        if (len == 0) {
            return 0;
        }

        if (len == 1) {
            return heights[0];
        }

        int res = 0;

        int[] newHeights = new int[len + 2];
        newHeights[0] = 0;
        System.arraycopy(heights, 0, newHeights, 1, len);
        newHeights[len + 1] = 0;
        len += 2;
        heights = newHeights;

        Deque<Integer> stack = new ArrayDeque<>(len);
        // 先放入哨兵，在循环里就不用做非空判断
        stack.addLast(0);

        for (int i = 1; i < len; i++) {
            while (heights[i] < heights[stack.peekLast()]) {
                int curHeight = heights[stack.pollLast()];
                int curWidth = i - stack.peekLast() - 1;
                res = Math.max(res, curHeight * curWidth);
            }
            stack.addLast(i);
        }
        return res;
    }
}
