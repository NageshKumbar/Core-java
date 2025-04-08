package com.xworkz.god.internal;

public class Bag {

    Perfume perfume = new Perfume();

    public Bag() {
        System.out.println("no-parameter const in Bag");
        perfume.fragrance();
    }
}