package com.xworkz.external;

import java.util.Objects;

public class Drum {
    String brand;
    String type;
    String material;
    boolean electronic;

    public void setDrum(String brand, String type, String material, boolean electronic) {
        this.brand = brand;
        this.type = type;
        this.material = material;
        this.electronic = electronic;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Type = " + type + ", Material = " + material + ", Electronic = " + electronic;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Drum) {
            Drum drum = (Drum) obj;
            if (Objects.equals(this.brand, drum.brand) && Objects.equals(this.type, drum.type) && Objects.equals(this.material, drum.material) && Objects.equals(this.electronic, drum.electronic)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}

