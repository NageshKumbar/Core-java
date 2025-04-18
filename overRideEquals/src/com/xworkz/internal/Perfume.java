package com.xworkz.internal;

import java.util.Objects;

public class Perfume {
    String brand;
    String scent;
    double size;
    String concentration;

    public Perfume(String brand, String scent, double size, String concentration) {
        this.brand = brand;
        this.scent = scent;
        this.size = size;
        this.concentration = concentration;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Scent = " + scent + ", Size = " + size + ", Concentration = " + concentration;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Perfume) {
            Perfume perfume = (Perfume) obj;
            if (Objects.equals(this.brand, perfume.brand) && Objects.equals(this.scent, perfume.scent) && Objects.equals(this.size, perfume.size) && Objects.equals(this.concentration, perfume.concentration)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
