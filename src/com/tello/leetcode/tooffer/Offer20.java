package com.tello.leetcode.tooffer;

public class Offer20 {
    public boolean isNumber(String s) {
        if(s.isEmpty()){
            return false;
        }
        char[] array = s.toCharArray();
        int start = 0,end = array.length-1;
        while(start<=end&&array[start]==' ')start++;
        while(start<=end&&array[end]==' ')end--;
        s = new String(array,start,end-start+1);
        return checkNum(s);
    }

    boolean checkNum(String s){
        int eIndex = s.indexOf("e");
        int EIndex = s.indexOf("E");

        if(eIndex<0&&EIndex<0){
            return checkWholeNum(s,true)||checkLittleNum(s);
        } else if(eIndex>0){
            String left = s.substring(0,eIndex);
            String right = s.substring(eIndex+1,s.length());
            return (checkWholeNum(left,true)||checkLittleNum(left))&&checkWholeNum(right,true);
        } else if(EIndex>0){
            String left = s.substring(0,EIndex);
            String right = s.substring(EIndex+1,s.length());
            return (checkWholeNum(left,true)||checkLittleNum(left))&&checkWholeNum(right,true);
        } else {
            return false;
        }
    }

    boolean checkLittleNum(String s){
        if(s.startsWith("+")||s.startsWith("-")){
            s = s.substring(1);
        }
        int pointIndex = s.indexOf(".");
        if(pointIndex<0){
            return false;
        }else if(pointIndex==0){
            s=s.substring(1);
            return checkWholeNum(s,false);
        }else if(pointIndex==s.length()-1){
            s = s.substring(0,pointIndex);
            return checkWholeNum(s,false);
        }else{
            String left = s.substring(0,pointIndex);
            String right = s.substring(pointIndex+1,s.length());
            if(!checkWholeNum(left,false)||!checkWholeNum(right,false)){
                return false;
            }
        }
        return true;
    }

    boolean checkWholeNum(String s,boolean needPre){
        if(needPre&&(s.startsWith("+")||s.startsWith("-"))){
            s = s.substring(1);
        }
        if(s.length()==0){
            return false;
        }
        for (char a:s.toCharArray()) {
            if(a<'0'||a>'9'){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "123.45";
        System.out.println(new String("0".toCharArray(),0,0));
    }
}
