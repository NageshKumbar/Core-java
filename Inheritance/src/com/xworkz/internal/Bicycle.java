package com.xworkz.internal;

public class Bicycle extends Part {
    public void adjustSeat() {
        System.out.println("Adjusting bicycle seat");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling bicycle");
    }
}
