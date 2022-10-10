package com.tello.leetcode.toofferii;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OfferII65 {


    public int minimumLengthEncoding(String[] words) {
        Set<String> good = new HashSet<String>(Arrays.asList(words));
        for (String word: words) {
            for (int k = 1; k < word.length(); ++k) {
                good.remove(word.substring(k));
            }
        }

        int ans = 0;
        for (String word: good) {
            ans += word.length() + 1;
        }
        return ans;
    }

//    public int minimumLengthEncoding(String[] words) {
//        int result = 0;
//        int pre = 0;
//        int back;
//        boolean needCheck;
//        while(pre<words.length){
//            back = pre+1;
//            needCheck = true;
//            while (needCheck&&back<words.length){
//                int preLength = words[pre].length();
//                int backLength = words[back].length();
//                if(backLength<=preLength){
//                    for (int i = 0; i < backLength; i++) {
//                        if(words[pre].charAt(preLength-i-1)!=words[back].charAt(backLength-i-1)){
//                            needCheck = false;
//                            break;
//                        }
//                    }
//                    if(needCheck){
//                        back++;
//                    }
//                }else{
//                    for (int i = 0; i < preLength; i++) {
//                        if(words[pre].charAt(preLength-i-1)!=words[back].charAt(backLength-i-1)){
//                            needCheck = false;
//                            break;
//                        }
//                    }
//                    if(needCheck){
//                        pre=back;
//                        back++;
//                    }
//                }
//                System.out.println(pre+"         "+back);
//            }
//            result += words[pre].length()+1;
//            pre = back;
//
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        String[] a = {"p","grah","qwosp"};
//        System.out.println(new OfferII65().minimumLengthEncoding(a));
//    }
}
