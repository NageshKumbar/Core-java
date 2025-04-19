package com.xworkz.external;

import java.util.Objects;

public class TennisRacket {
    String brand;
    String gripSize;
    String headSize;
    String weight;

    public void setTennisRacket(String brand, String gripSize, String headSize, String weight) {
        this.brand = brand;
        this.gripSize = gripSize;
        this.headSize = headSize;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", GripSize = " + gripSize + ", HeadSize = " + headSize + ", Weight = " + weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof TennisRacket) {
            TennisRacket tennisRacket = (TennisRacket) obj;
            if (Objects.equals(this.brand, tennisRacket.brand) && Objects.equals(this.gripSize, tennisRacket.gripSize) && Objects.equals(this.headSize, tennisRacket.headSize) && Objects.equals(this.weight, tennisRacket.weight)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}