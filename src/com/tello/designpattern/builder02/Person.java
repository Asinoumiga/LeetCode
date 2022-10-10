package com.tello.designpattern.builder02;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Person {
    private int age;
    private String sex;
    private String hobby;

    private Person(){
    }

    public static class PersonBuilder{
        private Person person;
        public PersonBuilder(){
            person = new Person();
        }

        public PersonBuilder age(int age){
            person.age = age;
            return this;
        }

        public PersonBuilder sex(String sex){
            person.sex = sex;
            return this;
        }

        public PersonBuilder hobby(String hobby){
            person.hobby = hobby;
            return this;
        }

        public Person build(){
            return person;
        };

    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
