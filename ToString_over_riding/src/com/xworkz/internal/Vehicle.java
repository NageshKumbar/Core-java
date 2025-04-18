package com.xworkz.internal;

public class Vehicle {
    final String type;
    final String fuel;
    public Vehicle(String type, String fuel) {
        this.type = type;
        this.fuel = fuel;
    }
    @Override public String toString() {
        return "Vehicle [type=" + type + ", fuel=" + fuel + "]";
    }
}