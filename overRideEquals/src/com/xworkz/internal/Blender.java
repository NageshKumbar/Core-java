package com.xworkz.internal;

import java.util.Objects;

public class Blender {
    String brand;
    int power;
    double capacity;
    boolean variableSpeed;

    public Blender(String brand, int power, double capacity, boolean variableSpeed) {
        this.brand = brand;
        this.power = power;
        this.capacity = capacity;
        this.variableSpeed = variableSpeed;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Power = " + power + ", Capacity = " + capacity + ", Variable Speed = " + variableSpeed;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Blender) {
            Blender blender = (Blender) obj;
            if (Objects.equals(this.brand, blender.brand) && Objects.equals(this.power, blender.power) && Objects.equals(this.capacity, blender.capacity) && Objects.equals(this.variableSpeed, blender.variableSpeed)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
