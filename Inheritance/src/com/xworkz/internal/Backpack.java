package com.xworkz.internal;

public class Backpack extends Supplies {
    public void organize() {
        System.out.println("Organizing backpack");
    }

    @Override
    public void use() {
        System.out.println("Using backpack");
    }
}
