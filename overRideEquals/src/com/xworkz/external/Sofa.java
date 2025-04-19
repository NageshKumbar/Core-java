package com.xworkz.external;

import java.util.Objects;

public class Sofa {
    String brand;
    String material;
    int seats;
    boolean recliner;

    public void setSofa(String brand, String material, int seats, boolean recliner) {
        this.brand = brand;
        this.material = material;
        this.seats = seats;
        this.recliner = recliner;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Material = " + material + ", Seats = " + seats + ", Recliner = " + recliner;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Sofa) {
            Sofa sofa = (Sofa) obj;
            if (Objects.equals(this.brand, sofa.brand) && Objects.equals(this.material, sofa.material) && Objects.equals(this.seats, sofa.seats) && Objects.equals(this.recliner, sofa.recliner)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}

