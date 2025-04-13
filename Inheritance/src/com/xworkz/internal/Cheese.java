package com.xworkz.internal;

public class Cheese extends Productz {
    public void slice() {
        System.out.println("Slicing cheese");
    }

    @Override
    public void produce() {
        System.out.println("Aging cheese");
    }
}
