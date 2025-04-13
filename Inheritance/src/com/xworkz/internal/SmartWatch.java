package com.xworkz.internal;

public class SmartWatch extends Gadget {
    public void trackHeartRate() {
        System.out.println("Tracking heart rate");
    }

    @Override
    public void operate() {
        System.out.println("Operating smartwatch");
    }
}