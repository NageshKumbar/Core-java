package com.xworkz.internal;

import java.util.Objects;

public class Basketball {
    String brand;
    String size;
    String material;
    boolean indoorOutdoor;

    public Basketball(String brand, String size, String material, boolean indoorOutdoor) {
        this.brand = brand;
        this.size = size;
        this.material = material;
        this.indoorOutdoor = indoorOutdoor;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Size = " + size + ", Material = " + material + ", Indoor/Outdoor = " + indoorOutdoor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Basketball) {
            Basketball basketball = (Basketball) obj;
            if (Objects.equals(this.brand, basketball.brand) && Objects.equals(this.size, basketball.size) && Objects.equals(this.material, basketball.material) && Objects.equals(this.indoorOutdoor, basketball.indoorOutdoor)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}

