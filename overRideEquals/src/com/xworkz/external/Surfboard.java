package com.xworkz.external;

import java.util.Objects;

public class Surfboard {
    String brand;
    String length;
    String type;
    String material;

    public void setSurfboard(String brand, String length, String type, String material) {
        this.brand = brand;
        this.length = length;
        this.type = type;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Length = " + length + ", Type = " + type + ", Material = " + material;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Surfboard) {
            Surfboard surfboard = (Surfboard) obj;
            if (Objects.equals(this.brand, surfboard.brand) && Objects.equals(this.length, surfboard.length) && Objects.equals(this.type, surfboard.type) && Objects.equals(this.material, surfboard.material)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
