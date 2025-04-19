package com.xworkz.external;

import java.util.Objects;

public class Basketball {
    String brand;
    String size;
    String material;
    boolean indoor;

    public void setBasketball(String brand, String size, String material, boolean indoor) {
        this.brand = brand;
        this.size = size;
        this.material = material;
        this.indoor = indoor;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Size = " + size + ", Material = " + material + ", Indoor = " + indoor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Basketball) {
            Basketball basketball = (Basketball) obj;
            if (Objects.equals(this.brand, basketball.brand) && Objects.equals(this.size, basketball.size) && Objects.equals(this.material, basketball.material) && Objects.equals(this.indoor, basketball.indoor)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}

