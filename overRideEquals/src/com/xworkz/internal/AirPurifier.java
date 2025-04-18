package com.xworkz.internal;

import java.util.Objects;

public class AirPurifier {
    String brand;
    int coverage;
    String filterType;
    boolean smart;

    public AirPurifier(String brand, int coverage, String filterType, boolean smart) {
        this.brand = brand;
        this.coverage = coverage;
        this.filterType = filterType;
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Coverage = " + coverage + ", Filter Type = " + filterType + ", Smart = " + smart;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof AirPurifier) {
            AirPurifier purifier = (AirPurifier) obj;
            if (Objects.equals(this.brand, purifier.brand) && Objects.equals(this.coverage, purifier.coverage) && Objects.equals(this.filterType, purifier.filterType) && Objects.equals(this.smart, purifier.smart)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
