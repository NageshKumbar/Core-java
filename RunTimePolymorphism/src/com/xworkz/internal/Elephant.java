package com.xworkz.internal;

public class Elephant extends Animal{

    @Override
    public void makeSound() {
        System.out.println("running makeSound in elephant");
    }

    public void trumpet() {
        System.out.println("running trumpet in elephant");
    }
}
