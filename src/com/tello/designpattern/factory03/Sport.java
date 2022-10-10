package com.tello.designpattern.factory03;

public class Sport {
    String name;
    public Sport(String name){
        this.name = name;
    }
    void play(){
        System.out.println("playing "+name);
    }
}
