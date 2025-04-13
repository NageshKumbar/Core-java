package com.xworkz.internal;

public class Fountain extends Feature {
    public void circulateWater() {
        System.out.println("Circulating fountain water");
    }

    @Override
    public void create() {
        System.out.println("Creating fountain");
    }
}