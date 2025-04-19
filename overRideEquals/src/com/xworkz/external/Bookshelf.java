package com.xworkz.external;

import java.util.Objects;

public class Bookshelf {
    String brand;
    String material;
    int shelves;
    double height;

    public void setBookshelf(String brand, String material, int shelves, double height) {
        this.brand = brand;
        this.material = material;
        this.shelves = shelves;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Material = " + material + ", Shelves = " + shelves + ", Height = " + height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bookshelf) {
            Bookshelf bookshelf = (Bookshelf) obj;
            if (Objects.equals(this.brand, bookshelf.brand) && Objects.equals(this.material, bookshelf.material) && Objects.equals(this.shelves, bookshelf.shelves) && Objects.equals(this.height, bookshelf.height)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
