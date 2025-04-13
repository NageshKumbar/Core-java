package com.xworkz.internal;

public class Stethoscope extends Devices {
    public void listen() {
        System.out.println("Listening with stethoscope");
    }

    @Override
    public void use() {
        System.out.println("Using stethoscope");
    }
}
