package com.tello.designpattern.factory03;

public class SportFactory {
    public Sport generateSport(String name){
        if(name.equals("football")){
            return new Football();
        }else if(name.equals("baseball")){
            return new BaseBall();
        }else{
            return new Sport(name);
        }
    }
}
