package com.tello.tooffer;

//��ָ Offer 58 - II. ����ת�ַ���
public class Offer58II {

    public String reverseLeftWords(String s, int n) {
        if(n>=s.length()){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(n,s.length()));
        sb.append(s.substring(0,n));
        return sb.toString();
    }
}
