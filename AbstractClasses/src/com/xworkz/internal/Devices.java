package com.xworkz.internal;

public abstract class Devices extends Appliances{
    @Override
    public void fridge() {
        System.out.println("overridden fridge in devices");
    }
}