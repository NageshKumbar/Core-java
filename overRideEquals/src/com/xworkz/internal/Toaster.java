package com.xworkz.internal;

import java.util.Objects;

public class Toaster {
    String brand;
    int slots;
    int settings;
    boolean bagelMode;

    public Toaster(String brand, int slots, int settings, boolean bagelMode) {
        this.brand = brand;
        this.slots = slots;
        this.settings = settings;
        this.bagelMode = bagelMode;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Slots = " + slots + ", Settings = " + settings + ", Bagel Mode = " + bagelMode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Toaster) {
            Toaster toaster = (Toaster) obj;
            if (Objects.equals(this.brand, toaster.brand) && Objects.equals(this.slots, toaster.slots) && Objects.equals(this.settings, toaster.settings) && Objects.equals(this.bagelMode, toaster.bagelMode)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
