package com.tello.leetcode.toofferii;

import com.tello.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class OfferII56 {
    List<Integer> numList;
    public boolean findTarget(TreeNode root, int k) {
        numList = new ArrayList();
        addNum(root);
        int pre = 0;
        int back = numList.size()-1;
        while (pre<back){
            if(numList.get(pre)+numList.get(back)>k){
                back--;
            }else if(numList.get(pre)+numList.get(back)<k){
                pre++;
            }else{
                return true;
            }
        }
        return false;
    }
    public void addNum(TreeNode node){
        if(node==null){
            return;
        }
        addNum(node.left);
        numList.add(node.val);
        addNum(node.right);
    }
}
