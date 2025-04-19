package com.xworkz.external;

import java.util.Objects;

public class Violin {
    String brand;
    String size;
    String woodType;
    int yearMade;

    public void setViolin(String brand, String size, String woodType, int yearMade) {
        this.brand = brand;
        this.size = size;
        this.woodType = woodType;
        this.yearMade = yearMade;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Size = " + size + ", WoodType = " + woodType + ", YearMade = " + yearMade;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Violin) {
            Violin violin = (Violin) obj;
            if (Objects.equals(this.brand, violin.brand) && Objects.equals(this.size, violin.size) && Objects.equals(this.woodType, violin.woodType) && Objects.equals(this.yearMade, violin.yearMade)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}

