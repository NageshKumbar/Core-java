package com.xworkz.internal;

public class Car extends Vehical{

    public void honk() {
        System.out.println("running honk in car");
    }

    @Override
    public void startEngine() {
        System.out.println("running StartEngine in car");
    }
}
