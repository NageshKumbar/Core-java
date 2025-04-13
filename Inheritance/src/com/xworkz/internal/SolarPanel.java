package com.xworkz.internal;

public class SolarPanel extends Source {
    public void cleanPanels() {
        System.out.println("Cleaning solar panels");
    }

    @Override
    public void generate() {
        System.out.println("Generating solar power");
    }
}