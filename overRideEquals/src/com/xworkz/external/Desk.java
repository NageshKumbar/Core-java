package com.xworkz.external;

import java.util.Objects;

public class Desk {
    String brand;
    String material;
    double width;
    boolean adjustableHeight;

    public void setDesk(String brand, String material, double width, boolean adjustableHeight) {
        this.brand = brand;
        this.material = material;
        this.width = width;
        this.adjustableHeight = adjustableHeight;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Material = " + material + ", Width = " + width + ", AdjustableHeight = " + adjustableHeight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Desk) {
            Desk desk = (Desk) obj;
            if (Objects.equals(this.brand, desk.brand) && Objects.equals(this.material, desk.material) && Objects.equals(this.width, desk.width) && Objects.equals(this.adjustableHeight, desk.adjustableHeight)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
