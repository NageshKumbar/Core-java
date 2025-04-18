package com.xworkz.internal;

public class Phone {
    final String model;
    final String brand;
    public Phone(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }
    @Override public String toString() {
        return "Phone [model=" + model + ", brand=" + brand + "]";
    }
}
