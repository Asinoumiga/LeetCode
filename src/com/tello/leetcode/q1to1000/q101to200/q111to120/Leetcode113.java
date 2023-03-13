package com.tello.leetcode.q1to1000.q101to200.q111to120;

import com.tello.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        intoTree(result,new ArrayList<>(),root,targetSum,0);
        return result;
    }

    void intoTree(List<List<Integer>> result,List<Integer> temp,TreeNode node,int targetSum,int nowSum){
        temp.add(node.val);
        if(node.left==null&&node.right==null){
            if(nowSum+node.val==targetSum){
                result.add(new ArrayList<>(temp));
            }
        }
        if(node.left!=null){
            intoTree(result,temp,node.left,targetSum,nowSum+node.val);
        }
        if(node.right!=null){
            intoTree(result,temp,node.right,targetSum,nowSum+node.val);
        }
        temp.remove(temp.size()-1);
    }
}
