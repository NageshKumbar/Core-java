package com.xworkz.internal;

public class CargoContainer extends Container {
    public void seal() {
        System.out.println("Sealing cargo container");
    }

    @Override
    public void ship() {
        System.out.println("Shipping cargo");
    }
}