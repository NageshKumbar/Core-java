package com.xworkz.internal;

public class Rocket extends Vehicles {
    public void stageSeparation() {
        System.out.println("Rocket stage separating");
    }

    @Override
    public void launch() {
        System.out.println("Rocket blasting off");
    }
}
