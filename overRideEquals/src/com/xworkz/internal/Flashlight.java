package com.xworkz.internal;

import java.util.Objects;

public class Flashlight {
    String brand;
    int lumens;
    boolean rechargeable;
    boolean waterproof;

    public Flashlight(String brand, int lumens, boolean rechargeable, boolean waterproof) {
        this.brand = brand;
        this.lumens = lumens;
        this.rechargeable = rechargeable;
        this.waterproof = waterproof;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Lumens = " + lumens + ", Rechargeable = " + rechargeable + ", Waterproof = " + waterproof;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Flashlight) {
            Flashlight flashlight = (Flashlight) obj;
            if (Objects.equals(this.brand, flashlight.brand) && Objects.equals(this.lumens, flashlight.lumens) && Objects.equals(this.rechargeable, flashlight.rechargeable) && Objects.equals(this.waterproof, flashlight.waterproof)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
