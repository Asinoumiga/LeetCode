package com.tello.testclass;

public class StringPractice {
//    有一个不定长度的String，其中前面是字母，后边是数字,例如："abcd123.456", 要求写一个方法得到其中的数字以String的形式返回,数字保留小数点后两位， 不四舍五入，截去多余小数,例如："abcd123.456"，得到"123.45" 如果数字没有小数点,要得到两位为0的小数，例如："abcd123"，得到"123.00".
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
