package com.tello.leetcode.q1to1000.q601to700.q661to670;

public class Leetcode670 {
//    public int maximumSwap(int num) {
//        if(num<10){
//            return num;
//        }
//        int[] max = {-1,-1};
//        int[] min = {10,10};
//        int index = 0;
//        int temp = num;
//
//        while(temp>0){
//            int now;
//            do{
//                index++;
//                now = temp%10;
//                temp /=10;
//            }while (temp>0&&temp%10>now&&now>max[1]);
//
//            if(now<max[1]||temp>0) {
//                if (max[1] < now) {
//                    max[0] = index;
//                    max[1] = now;
//                } else if (max[1] > now) {
//                    min[0] = index;
//                    min[1] = now;
//                }
//            }
//
//        }
//        System.out.println("max: "+max[0]+" "+max[1]);
//        System.out.println("min: "+min[0]+" "+min[1]);
//        if(min[1]==10){
//            return num;
//        }
//        int result = 0;
//        index = 0;
//        while (num>0){
//            index++;
//            if(index==min[0]){
//                result+=max[1]*Math.pow(10,index-1);
//            }else if(index==max[0]){
//                result+=min[1]*Math.pow(10,index-1);
//            }else{
//                result+=(num%10)*Math.pow(10,index-1);
//            }
//            num/=10;
//        }
//        return result;
//    }
public int maximumSwap(int num) {
    char[] ch = String.valueOf(num).toCharArray();
    int len = ch.length;
    int maxIndex = len - 1;//�����ѡ����λ��
    int left = 0,right = 0;//����������Ҫ����������λ��
    for (int i = len - 1;i >= 0;i--) {
        if (ch[i] > ch[maxIndex]) maxIndex = i;//����ѡ��ǰ�����˱������������ô���º�ѡ����
        else if (ch[i] < ch[maxIndex]) {
            left = i;
            right = maxIndex;//ֻ�е���ѡ��ǰ���ڱ���С����������Ҫ����λ��
        }
    }
    swap(ch,left,right);
    return Integer.parseInt(new String(ch));
}
    public void swap(char[] arr,int i,int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Leetcode670 test = new Leetcode670();
        System.out.println(test.maximumSwap(42198231));
    }
}
