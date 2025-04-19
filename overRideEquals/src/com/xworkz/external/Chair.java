package com.xworkz.external;

import java.util.Objects;

public class Chair {
    String brand;
    String material;
    String type;
    boolean adjustable;

    public void setChair(String brand, String material, String type, boolean adjustable) {
        this.brand = brand;
        this.material = material;
        this.type = type;
        this.adjustable = adjustable;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Material = " + material + ", Type = " + type + ", Adjustable = " + adjustable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Chair) {
            Chair chair = (Chair) obj;
            if (Objects.equals(this.brand, chair.brand) && Objects.equals(this.material, chair.material) && Objects.equals(this.type, chair.type) && Objects.equals(this.adjustable, chair.adjustable)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
