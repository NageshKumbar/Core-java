package com.xworkz.internal;

public class Tank extends Equipment {
    public void fireCannon() {
        System.out.println("Firing tank cannon");
    }

    @Override
    public void operate() {
        System.out.println("Operating tank");
    }
}
