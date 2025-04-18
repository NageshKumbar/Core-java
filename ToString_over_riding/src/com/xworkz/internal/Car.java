package com.xworkz.internal;

public class Car extends Vehicle {
    public Car(String type, String fuel) {
        super(type, fuel);
    }
    @Override public String toString() {
        return "Car [type=" + type + ", fuel=" + fuel + "]";
    }
}
