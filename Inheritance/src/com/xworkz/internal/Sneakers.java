package com.xworkz.internal;

public class Sneakers extends Shoe {
    public void tieLaces() {
        System.out.println("Tying sneaker laces");
    }

    @Override
    public void wear() {
        System.out.println("Wearing sneakers");
    }
}
