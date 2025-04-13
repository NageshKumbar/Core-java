package com.xworkz.internal;

public class Circle extends Shape {
    public void calculateRadius() {
        System.out.println("Calculating circle radius");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}