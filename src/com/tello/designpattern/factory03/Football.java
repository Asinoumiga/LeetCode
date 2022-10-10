package com.tello.designpattern.factory03;

public class Football extends Sport{

    public Football(){
        super("football");
    }

    public void play(){
        super.play();
        System.out.println("and play it well");
    }
}
