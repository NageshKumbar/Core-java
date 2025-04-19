package com.xworkz.external;

import java.util.Objects;

public class YogaMat {
    String brand;
    String thickness;
    String material;
    boolean nonSlip;

    public void setYogaMat(String brand, String thickness, String material, boolean nonSlip) {
        this.brand = brand;
        this.thickness = thickness;
        this.material = material;
        this.nonSlip = nonSlip;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Thickness = " + thickness + ", Material = " + material + ", NonSlip = " + nonSlip;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof YogaMat) {
            YogaMat yogaMat = (YogaMat) obj;
            if (Objects.equals(this.brand, yogaMat.brand) && Objects.equals(this.thickness, yogaMat.thickness) && Objects.equals(this.material, yogaMat.material) && Objects.equals(this.nonSlip, yogaMat.nonSlip)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
