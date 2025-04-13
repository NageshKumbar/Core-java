package com.xworkz.internal;

public class AirConditioner extends Unit {
    public void changeFilter() {
        System.out.println("Changing AC filter");
    }

    @Override
    public void operate() {
        System.out.println("Operating air conditioner");
    }
}