package com.xworkz.internal;

import java.util.Objects;

public class WaterBottle {
    String material;
    double capacity;
    boolean insulated;
    boolean straw;

    public WaterBottle(String material, double capacity, boolean insulated, boolean straw) {
        this.material = material;
        this.capacity = capacity;
        this.insulated = insulated;
        this.straw = straw;
    }

    @Override
    public String toString() {
        return "Material = " + material + ", Capacity = " + capacity + ", Insulated = " + insulated + ", Straw = " + straw;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof WaterBottle) {
            WaterBottle bottle = (WaterBottle) obj;
            if (Objects.equals(this.material, bottle.material) && Objects.equals(this.capacity, bottle.capacity) && Objects.equals(this.insulated, bottle.insulated) && Objects.equals(this.straw, bottle.straw)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
