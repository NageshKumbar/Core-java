package com.xworkz.internal;

public class Detergent extends Supply {
    public void measure() {
        System.out.println("Measuring detergent");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning with detergent");
    }
}