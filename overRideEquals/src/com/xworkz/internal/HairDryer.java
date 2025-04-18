package com.xworkz.internal;

import java.util.Objects;

public class HairDryer {
    String brand;
    int wattage;
    int attachments;
    boolean ionic;

    public HairDryer(String brand, int wattage, int attachments, boolean ionic) {
        this.brand = brand;
        this.wattage = wattage;
        this.attachments = attachments;
        this.ionic = ionic;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Wattage = " + wattage + ", Attachments = " + attachments + ", Ionic = " + ionic;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof HairDryer) {
            HairDryer dryer = (HairDryer) obj;
            if (Objects.equals(this.brand, dryer.brand) && Objects.equals(this.wattage, dryer.wattage) && Objects.equals(this.attachments, dryer.attachments) && Objects.equals(this.ionic, dryer.ionic)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}