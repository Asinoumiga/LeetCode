package com.tello.designpattern.abstractfactory01;

public interface PersonFactory {
    Person buildPerson(int age,String hobby);
}
