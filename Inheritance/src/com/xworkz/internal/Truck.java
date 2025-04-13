package com.xworkz.internal;

public class Truck extends Transport {
    public void loadCargo() {
        System.out.println("Loading truck cargo");
    }

    @Override
    public void move() {
        System.out.println("Truck driving on highway");
    }
}
