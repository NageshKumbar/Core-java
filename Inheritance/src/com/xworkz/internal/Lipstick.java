package com.xworkz.internal;

public class Lipstick extends Product1 {
    public void twistUp() {
        System.out.println("Twisting up lipstick");
    }

    @Override
    public void apply() {
        System.out.println("Applying lipstick");
    }
}