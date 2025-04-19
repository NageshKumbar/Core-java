package com.xworkz.external;

import java.util.Objects;

public class Dumbbell {
    String brand;
    String weight;
    String material;
    boolean adjustable;

    public void setDumbbell(String brand, String weight, String material, boolean adjustable) {
        this.brand = brand;
        this.weight = weight;
        this.material = material;
        this.adjustable = adjustable;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Weight = " + weight + ", Material = " + material + ", Adjustable = " + adjustable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Dumbbell) {
            Dumbbell dumbbell = (Dumbbell) obj;
            if (Objects.equals(this.brand, dumbbell.brand) && Objects.equals(this.weight, dumbbell.weight) && Objects.equals(this.material, dumbbell.material) && Objects.equals(this.adjustable, dumbbell.adjustable)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}