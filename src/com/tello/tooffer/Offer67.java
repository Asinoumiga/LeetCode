package com.tello.tooffer;

//剑指 Offer 67. 把字符串转换成整数
public class Offer67 {
    public int strToInt(String str) {
        if(str.isEmpty()){
            return 0;
        }
        char[] array = str.toCharArray();
        int start = 0;
        while(start<str.length()&&array[start]==' ')start++;
        str = new String(array,start,str.length()-start);
        boolean isLow = false;
        long result = 0l;
        if(str.startsWith("+")){
            str = str.substring(1);
        }else if(str.startsWith("-")){
            isLow = true;
            str = str.substring(1);
        }
        if(str.length()==0){
            return 0;
        }
        for (char a:str.toCharArray()) {
            if(a>='0'&&a<='9'){
                result=result*10+a-'0';
            }else{
                break;
            }
            if(isLow&&-result<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }else if(!isLow&&result>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
        }
        if(isLow){
            return -(int)result;
        }
        return (int)result;
    }
}
