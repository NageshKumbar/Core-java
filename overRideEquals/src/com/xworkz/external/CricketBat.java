package com.xworkz.external;

import java.util.Objects;

public class CricketBat {
    String brand;
    String type;
    String weight;
    String size;

    public void setCricketBat(String brand, String type, String weight, String size) {
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Type = " + type + ", Weight = " + weight + ", Size = " + size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof CricketBat) {
            CricketBat cricketBat = (CricketBat) obj;
            if (Objects.equals(this.brand, cricketBat.brand) && Objects.equals(this.type, cricketBat.type) && Objects.equals(this.weight, cricketBat.weight) && Objects.equals(this.size, cricketBat.size)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}