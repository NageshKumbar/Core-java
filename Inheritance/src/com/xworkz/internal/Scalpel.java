package com.xworkz.internal;

public class Scalpel extends Tools {
    public void sterilize() {
        System.out.println("Sterilizing scalpel");
    }

    @Override
    public void use() {
        System.out.println("Using scalpel");
    }
}
