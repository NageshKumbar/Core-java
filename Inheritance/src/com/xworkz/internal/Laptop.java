package com.xworkz.internal;

public class Laptop extends Device {

    public void openLid() {
        System.out.println("running openLid in laptop");
    }

    @Override
    public void powerOn() {
        System.out.println("running powerOn in laptop");
    }
}
