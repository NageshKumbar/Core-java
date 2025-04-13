package com.xworkz.internal;

public class OffsetPress extends Machine {
    public void mixInk() {
        System.out.println("Mixing offset ink");
    }

    @Override
    public void print() {
        System.out.println("Printing with offset press");
    }
}