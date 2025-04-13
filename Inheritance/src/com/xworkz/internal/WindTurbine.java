package com.xworkz.internal;

public class WindTurbine extends System1 {
    public void adjustBlades() {
        System.out.println("Adjusting turbine blades");
    }

    @Override
    public void generate() {
        System.out.println("Generating wind power");
    }
}