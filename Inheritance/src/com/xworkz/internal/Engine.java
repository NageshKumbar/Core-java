package com.xworkz.internal;

public class Engine extends CarPart {
    public void checkOil() {
        System.out.println("Checking engine oil");
    }

    @Override
    public void function() {
        System.out.println("Engine running");
    }
}
