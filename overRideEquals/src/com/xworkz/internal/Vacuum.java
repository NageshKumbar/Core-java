package com.xworkz.internal;

import java.util.Objects;

public class Vacuum {
    String brand;
    String type;
    boolean bagless;
    boolean hepaFilter;

    public Vacuum(String brand, String type, boolean bagless, boolean hepaFilter) {
        this.brand = brand;
        this.type = type;
        this.bagless = bagless;
        this.hepaFilter = hepaFilter;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Type = " + type + ", Bagless = " + bagless + ", HEPA Filter = " + hepaFilter;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Vacuum) {
            Vacuum vacuum = (Vacuum) obj;
            if (Objects.equals(this.brand, vacuum.brand) && Objects.equals(this.type, vacuum.type) && Objects.equals(this.bagless, vacuum.bagless) && Objects.equals(this.hepaFilter, vacuum.hepaFilter)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
