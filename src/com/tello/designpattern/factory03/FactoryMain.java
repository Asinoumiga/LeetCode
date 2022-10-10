package com.tello.designpattern.factory03;

public class FactoryMain {
    public static void main(String[] args) {
        SportFactory factory = new SportFactory();
        Sport a = factory.generateSport("football");
        a.play();
    }
}
