package com.xworkz.external;

import java.util.Objects;

public class Belt {
    String brand;
    String material;
    String size;
    String buckleType;

    public void setBelt(String brand, String material, String size, String buckleType) {
        this.brand = brand;
        this.material = material;
        this.size = size;
        this.buckleType = buckleType;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Material = " + material + ", Size = " + size + ", BuckleType = " + buckleType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Belt) {
            Belt belt = (Belt) obj;
            if (Objects.equals(this.brand, belt.brand) && Objects.equals(this.material, belt.material) && Objects.equals(this.size, belt.size) && Objects.equals(this.buckleType, belt.buckleType)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}