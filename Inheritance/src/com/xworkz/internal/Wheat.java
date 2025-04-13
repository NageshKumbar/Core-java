package com.xworkz.internal;

public class Wheat extends Crop {
    public void harvest() {
        System.out.println("Harvesting wheat");
    }

    @Override
    public void grow() {
        System.out.println("Wheat growing tall");
    }
}
