package com.tello.leetcode.toofferii;

import com.tello.leetcode.common.TreeNode;


public class OfferII50 {
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        int inResult = 0;

        inResult+= godown(root,targetSum);
        inResult+= pathSum(root.left,targetSum);
        inResult+= pathSum(root.right,targetSum);
        return inResult;
    }

    public int godown(TreeNode root, int targetSum){
        if(root==null){
            return 0;
        }
        int inResult = 0;
        if(root.val==targetSum){
            System.out.println(root.val);
            inResult++;
        }
        inResult+= godown(root.left,targetSum-root.val);
        inResult+= godown(root.right,targetSum-root.val);
        return inResult;
    }
//    public Integer insideSum(TreeNode node, List<Integer> target){
//        if(node==null){
//            return null;
//        }
//        Integer inResult = 0;
//        if(target!=null&&target-node.val==0){
//            inResult++;
//        }
//        if(target2!=null&&target2-node.val==0){
//            result++;
//        }
//        if(targetNum-node.val==0){
//            result++;
//        }
//        Integer left = insideSum(node.left,target-node.val,targetNum-node.val);
//        Integer right = insideSum(node.right,target-node.val,targetNum-node.val);
//        if(left!=null){
//            result+=left;
//        }
//        if(right!=null){
//            result+=right;
//        }
//        return inResult;
//    }
}
