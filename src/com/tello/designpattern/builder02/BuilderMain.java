package com.tello.designpattern.builder02;

public class BuilderMain {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .age(10)
                .sex("man")
                .hobby("play")
                .build();
        System.out.println(person.toString());
    }
}
