package com.xworkz.internal;

public class Skis extends Gears {
    public void wax() {
        System.out.println("Waxing skis");
    }

    @Override
    public void use() {
        System.out.println("Using skis");
    }
}