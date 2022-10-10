package com.tello.designpattern.prototype04;

public class SoccerField implements Cloneable{
    String name;
    int area;
    int seats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "SoccerField{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", seats=" + seats +
                '}';
    }
}
