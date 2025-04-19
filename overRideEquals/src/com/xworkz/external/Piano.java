package com.xworkz.external;

import java.util.Objects;

public class Piano {
    String brand;
    String type;
    int keys;
    boolean digital;

    public void setPiano(String brand, String type, int keys, boolean digital) {
        this.brand = brand;
        this.type = type;
        this.keys = keys;
        this.digital = digital;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Type = " + type + ", Keys = " + keys + ", Digital = " + digital;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Piano) {
            Piano piano = (Piano) obj;
            if (Objects.equals(this.brand, piano.brand) && Objects.equals(this.type, piano.type) && Objects.equals(this.keys, piano.keys) && Objects.equals(this.digital, piano.digital)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
