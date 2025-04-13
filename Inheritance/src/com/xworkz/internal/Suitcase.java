package com.xworkz.internal;


public class Suitcase extends Bag {
    public void extendHandle() {
        System.out.println("Extending suitcase handle");
    }

    @Override
    public void pack() {
        System.out.println("Packing suitcase");
    }
}