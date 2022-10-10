package com.tello.designpattern.abstractfactory01;

public class abstractFactoryMain {
    public static void main(String[] args) {
        PersonFactory factory = new ManFactory();
        Person person = factory.buildPerson(10,"football");
        System.out.println(person.getSex());
    }
}
