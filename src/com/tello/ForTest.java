package com.tello;

import com.tello.prepare.Position;

import java.util.ArrayList;
import java.util.List;

public class ForTest implements Runnable{
    public static void main(String[] args) {
//        int a = 4;
//        System.out.println(a&1<<2);
//        System.out.println(a>>1&1);
//        System.out.println(a>>2&1);
//        System.out.println(a>>3&1);
//        System.out.println(a>>4&1);
//        System.out.println(a^ 1<<1);
        ForTest forTest = new ForTest();
        Thread thread = new Thread(forTest);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("hello world");
    }
}
