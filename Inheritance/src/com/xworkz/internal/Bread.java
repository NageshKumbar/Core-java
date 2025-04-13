package com.xworkz.internal;

public class Bread extends Iteam {
    public void knead() {
        System.out.println("Kneading dough");
    }

    @Override
    public void bake() {
        System.out.println("Baking bread");
    }
}