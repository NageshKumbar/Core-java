package com.xworkz.external;

import java.util.Objects;

public class Lamp {
    String brand;
    String type;
    int wattage;
    boolean dimmable;

    public void setLamp(String brand, String type, int wattage, boolean dimmable) {
        this.brand = brand;
        this.type = type;
        this.wattage = wattage;
        this.dimmable = dimmable;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Type = " + type + ", Wattage = " + wattage + ", Dimmable = " + dimmable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Lamp) {
            Lamp lamp = (Lamp) obj;
            if (Objects.equals(this.brand, lamp.brand) && Objects.equals(this.type, lamp.type) && Objects.equals(this.wattage, lamp.wattage) && Objects.equals(this.dimmable, lamp.dimmable)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
