package com.xworkz.internal;

public class Flower extends Plant {
    public void bloom() {
        System.out.println("Flower is blooming");
    }

    @Override
    public void grow() {
        System.out.println("Flower is growing taller");
    }
}