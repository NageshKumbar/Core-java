package com.xworkz.internal;

public class Shape extends Polygon {
    @Override
    public void square() {
        System.out.println("printing square in polygon");
    }

    @Override
    public void triangle() {
        System.out.println("printing triangle in polygon");
    }

    @Override
    public void circle() {
        System.out.println("printing circle in polygon");
    }

    @Override
    public void diagonal() {
        System.out.println("printing diagonal in polygon");
    }

    @Override
    public void rectangle() {
        System.out.println("printing rectangle in polygon");
    }
}
