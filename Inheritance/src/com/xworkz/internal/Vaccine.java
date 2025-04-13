package com.xworkz.internal;

public class Vaccine extends Medicine1 {
    public void testPotency() {
        System.out.println("Testing vaccine potency");
    }

    @Override
    public void develop() {
        System.out.println("Developing vaccine");
    }
}