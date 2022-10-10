package com.tello.designpattern.factory03;

public class BaseBall extends Sport{

    public BaseBall(){
        super("BaseBall");
    }

    public void play(){
        super.play();
        System.out.println("and don't want to play");
    }
}
