package com.xworkz.internal;

public class Electronic {
    final String device;
    final String brand;
    public Electronic(String device, String brand) {
        this.device = device;
        this.brand = brand;
    }
    @Override public String toString() {
        return "Electronic [device=" + device + ", brand=" + brand + "]";
    }
}