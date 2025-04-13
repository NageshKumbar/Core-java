package com.xworkz.internal;

public class Bottle extends Plastic {
    public void cap() {
        System.out.println("Capping bottle");
    }

    @Override
    public void mold() {
        System.out.println("Molding plastic bottle");
    }
}
