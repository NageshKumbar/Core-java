package com.xworkz.internal;

public class Airplane extends Vehicle {
    public void takeOff() {
        System.out.println("Airplane is taking off");
    }

    @Override
    public void move() {
        System.out.println("Airplane is flying");
    }
}