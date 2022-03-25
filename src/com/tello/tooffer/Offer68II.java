package com.tello.tooffer;

public class Offer68II {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
        public class PQresult{
          TreeNode result;
          boolean haveP;
          boolean haveQ;
          PQresult(boolean haveP,boolean haveQ,TreeNode result) { this.haveP = haveP; this.haveQ = haveQ; this.result = result;}

      }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        PQresult result = inTree(root,p,q);
        return result.result;
    }

    PQresult inTree(TreeNode node , TreeNode p,TreeNode q){
          if(node==null){
              return new PQresult(false,false,null);
          }
        PQresult left = inTree(node.left,p,q);
        PQresult right = inTree(node.right,p,q);
        if(left.result!=null){
            return left;
        }
        if(right.result!=null){
            return right;
        }
       if((left.haveP||right.haveP||node.equals(p))&&(left.haveQ||right.haveQ||node.equals(q))){
           return new PQresult(true,true,node);
       }
       if(left.haveP||right.haveP||node.equals(p)){
           return new PQresult(true,false,null);
       }
        if(left.haveQ||right.haveQ||node.equals(q)){
            return new PQresult(false,true,null);
        }
        return new PQresult(false,false,null);
    }
}
