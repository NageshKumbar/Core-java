package com.xworkz.external;

import java.util.Objects;

public class Football {
    String brand;
    String size;
    String material;
    boolean officialSize;

    public void setFootball(String brand, String size, String material, boolean officialSize) {
        this.brand = brand;
        this.size = size;
        this.material = material;
        this.officialSize = officialSize;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Size = " + size + ", Material = " + material + ", OfficialSize = " + officialSize;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Football) {
            Football football = (Football) obj;
            if (Objects.equals(this.brand, football.brand) && Objects.equals(this.size, football.size) && Objects.equals(this.material, football.material) && Objects.equals(this.officialSize, football.officialSize)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}