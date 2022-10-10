package com.tello.designpattern.abstractfactory01;

public class WomanFactory implements PersonFactory{

    @Override
    public Person buildPerson(int age, String hobby) {
        Person person = new Woman();
        person.setAge(age);
        person.setHobby(hobby);
        return person;
    }
}
