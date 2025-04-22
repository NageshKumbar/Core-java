package com.xworkz.external1;

import com.xworkz.internal.rules1.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Running start in Bike");
    }

    @Override
    public void stop() {
        System.out.println("Running stop in Bike");
    }

    @Override
    public void horn() {
        System.out.println("running horn in bike");
    }
}
