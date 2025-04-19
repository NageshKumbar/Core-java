package com.xworkz.external;

import java.util.Objects;

public class Mirror {
    String brand;
    String shape;
    double width;
    boolean framed;

    public void setMirror(String brand, String shape, double width, boolean framed) {
        this.brand = brand;
        this.shape = shape;
        this.width = width;
        this.framed = framed;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Shape = " + shape + ", Width = " + width + ", Framed = " + framed;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mirror) {
            Mirror mirror = (Mirror) obj;
            if (Objects.equals(this.brand, mirror.brand) && Objects.equals(this.shape, mirror.shape) && Objects.equals(this.width, mirror.width) && Objects.equals(this.framed, mirror.framed)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
