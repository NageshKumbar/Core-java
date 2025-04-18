package com.xworkz.internal;

import java.util.Objects;

public class Monitor {
    String brand;
    double size;
    String resolution;
    boolean curved;

    public Monitor(String brand, double size, String resolution, boolean curved) {
        this.brand = brand;
        this.size = size;
        this.resolution = resolution;
        this.curved = curved;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Size = " + size + ", Resolution = " + resolution + ", Curved = " + curved;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Monitor) {
            Monitor monitor = (Monitor) obj;
            if (Objects.equals(this.brand, monitor.brand) && Objects.equals(this.size, monitor.size) && Objects.equals(this.resolution, monitor.resolution) && Objects.equals(this.curved, monitor.curved)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}

