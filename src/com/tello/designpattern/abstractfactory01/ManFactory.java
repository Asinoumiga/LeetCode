package com.tello.designpattern.abstractfactory01;

public class ManFactory implements PersonFactory{

    @Override
    public Person buildPerson(int age, String hobby) {
        Person person = new Man();
        person.setAge(age);
        person.setHobby(hobby);
        return person;
    }
}
