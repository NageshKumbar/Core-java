package com.xworkz.internal;

public class Laptop extends Electronic {
    public Laptop(String device, String brand) {
        super(device, brand);
    }
    @Override public String toString() {
        return "Laptop [device=" + device + ", brand=" + brand + "]";
    }
}
