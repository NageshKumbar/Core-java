package com.xworkz.external;

import java.util.Objects;

public class Table {
    String brand;
    String material;
    String shape;
    int legs;

    public void setTable(String brand, String material, String shape, int legs) {
        this.brand = brand;
        this.material = material;
        this.shape = shape;
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Material = " + material + ", Shape = " + shape + ", Legs = " + legs;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Table) {
            Table table = (Table) obj;
            if (Objects.equals(this.brand, table.brand) && Objects.equals(this.material, table.material) && Objects.equals(this.shape, table.shape) && Objects.equals(this.legs, table.legs)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}

