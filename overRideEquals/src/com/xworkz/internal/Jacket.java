package com.xworkz.internal;

import java.util.Objects;

public class Jacket {
    String material;
    String size;
    boolean waterproof;
    boolean hooded;

    public Jacket(String material, String size, boolean waterproof, boolean hooded) {
        this.material = material;
        this.size = size;
        this.waterproof = waterproof;
        this.hooded = hooded;
    }

    @Override
    public String toString() {
        return "Material = " + material + ", Size = " + size + ", Waterproof = " + waterproof + ", Hooded = " + hooded;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Jacket) {
            Jacket jacket = (Jacket) obj;
            if (Objects.equals(this.material, jacket.material) && Objects.equals(this.size, jacket.size) && Objects.equals(this.waterproof, jacket.waterproof) && Objects.equals(this.hooded, jacket.hooded)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
