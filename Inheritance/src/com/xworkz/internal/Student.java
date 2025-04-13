package com.xworkz.internal;

public class Student extends Person {
    public void study() {
        System.out.println("Student is studying");
    }

    @Override
    public void introduce() {
        System.out.println("I am a student");
    }
}