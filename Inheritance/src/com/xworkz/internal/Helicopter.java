package com.xworkz.internal;

public class Helicopter extends Aircraft {
    public void rotateBlades() {
        System.out.println("Rotating helicopter blades");
    }

    @Override
    public void fly() {
        System.out.println("Helicopter hovering");
    }
}
