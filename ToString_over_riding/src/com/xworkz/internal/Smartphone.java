package com.xworkz.internal;

public class Smartphone extends Phone {
    public Smartphone(String model, String brand) {
        super(model, brand);
    }
    @Override public String toString() {
        return "Smartphone [model=" + model + ", brand=" + brand + "]";
    }
}

