package com.tello.leetcode.q1to1000.q501to600.q541to550;

import com.tello.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode545 {

    List<Integer> boundList = new ArrayList<>();
    List<TreeNode> bottomSearch = new ArrayList<>();
    List<Integer> backBoundList = new ArrayList<>();

    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        boundList.add(root.val);
        getLeftVal(root.left);
        getRightVal(root.right);
        for (int i = 0; i < bottomSearch.size(); i++) {
            System.out.println(bottomSearch.get(i).val);
            getBottomVal(bottomSearch.get(i));
        }
        boundList.addAll(backBoundList);
        return boundList;
    }
    void getLeftVal(TreeNode node){
        if (node==null){
            return;
        }
        boundList.add(node.val);
        if(node.left!=null){
            getLeftVal(node.left);
            bottomSearch.add(node.right);
        }else{
            getLeftVal(node.right);
        }
    }

    void getRightVal(TreeNode node){
        if (node==null){
            return;
        }
        if(node.right!=null){
            bottomSearch.add(node.left);
            getRightVal(node.right);
        }else{
            getRightVal(node.left);
        }
        backBoundList.add(node.val);
    }

    void getBottomVal(TreeNode node){
        if(node==null){
            return;
        }
        if(node.left == null&&node.right == null){
            boundList.add(node.val);
            return;
        }
        if(node.left!=null){
            getBottomVal(node.left);
        }
        if(node.right!=null){
            getBottomVal(node.right);
        }
    }
}
