package com.xworkz.external;

import java.util.Objects;

public class Bed {
    String brand;
    String size;
    String frameMaterial;
    boolean hasStorage;

    public void setBed(String brand, String size, String frameMaterial, boolean hasStorage) {
        this.brand = brand;
        this.size = size;
        this.frameMaterial = frameMaterial;
        this.hasStorage = hasStorage;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Size = " + size + ", FrameMaterial = " + frameMaterial + ", HasStorage = " + hasStorage;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bed) {
            Bed bed = (Bed) obj;
            if (Objects.equals(this.brand, bed.brand) && Objects.equals(this.size, bed.size) && Objects.equals(this.frameMaterial, bed.frameMaterial) && Objects.equals(this.hasStorage, bed.hasStorage)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
