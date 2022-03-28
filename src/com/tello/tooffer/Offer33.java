package com.tello.tooffer;

public class Offer33 {
    public boolean verifyPostorder(int[] postorder) {
        if(postorder==null||postorder.length==0){
            return true;
        }
        boolean result = verifyPostorder(postorder,0,postorder.length-1);
        return result;
    }

    public boolean verifyPostorder(int[] postorder,int pre,int back) {
        if(pre==back){
            return true;
        }
        int x=pre,y=back-1;
        while (x<y){
            while (x<y&&postorder[x]<postorder[back])x++;
            while (x<y&&postorder[y]>postorder[back])y--;
            if(y-x>0){
                return false;
            }
        }
        return verifyPostorder(postorder,pre,x)&&verifyPostorder(postorder,y,back-1);
    }

}
