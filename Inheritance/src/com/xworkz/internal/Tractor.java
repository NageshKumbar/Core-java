package com.xworkz.internal;

public class Tractor extends Equipment3 {
    public void attachImplement() {
        System.out.println("Attaching farm implement");
    }

    @Override
    public void operate() {
        System.out.println("Operating tractor");
    }
}