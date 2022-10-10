package com.tello.designpattern.prototype04;

public class FootballPlayer implements Cloneable{
    String name;
    String position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void play(){
        System.out.println(name+" player in "+position+" playing football");
    }
    public Object clone() throws CloneNotSupportedException {
        return (FootballPlayer) super.clone();
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
