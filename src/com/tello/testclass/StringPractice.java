package com.tello.testclass;

public class StringPractice {
//    ��һ���������ȵ�String������ǰ������ĸ�����������,���磺"abcd123.456", Ҫ��дһ�������õ����е�������String����ʽ����,���ֱ���С�������λ�� ���������룬��ȥ����С��,���磺"abcd123.456"���õ�"123.45" �������û��С����,Ҫ�õ���λΪ0��С�������磺"abcd123"���õ�"123.00".
    public static void main(String[] args) {
        String input1 = "abcd123.456";
        String input2 = "abcd123";
        String input3 = "abcd123.4";
        String input4 = "abcd";

        System.out.println(formatNumberByString(input1));
        System.out.println(formatNumberByString(input2));
        System.out.println(formatNumberByString(input3));
        System.out.println(formatNumberByString(input4));
    }

    public static String formatNumberByString(String input) {
        String numStr = input.replaceAll("[a-z|A-Z]","");

        if (numStr.isEmpty()) {
            numStr = "0";
        }
        int dotIndex = numStr.indexOf('.');

        if (dotIndex == -1) {
            return numStr + ".00";
        } else {
            StringBuilder formattedNum = new StringBuilder(numStr.substring(0, dotIndex + 1));
            String decimalNum = numStr.substring(dotIndex + 1);
            if (decimalNum.length() >= 2) {
                formattedNum.append(decimalNum.substring(0, 2));
            } else if (decimalNum.length() == 1){
                formattedNum.append(decimalNum).append("0");
            } else {
                formattedNum.append("00");
            }
            return formattedNum.toString();
        }
    }
}
