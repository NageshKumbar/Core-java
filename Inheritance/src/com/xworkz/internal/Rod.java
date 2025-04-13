package com.xworkz.internal;

public class Rod extends Equipments {
    public void cast() {
        System.out.println("Casting fishing rod");
    }

    @Override
    public void use() {
        System.out.println("Using fishing rod");
    }
}