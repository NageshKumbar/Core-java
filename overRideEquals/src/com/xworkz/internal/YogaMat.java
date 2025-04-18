package com.xworkz.internal;

import java.util.Objects;

public class YogaMat {
    String material;
    double thickness;
    String texture;
    boolean carryingStrap;

    public YogaMat(String material, double thickness, String texture, boolean carryingStrap) {
        this.material = material;
        this.thickness = thickness;
        this.texture = texture;
        this.carryingStrap = carryingStrap;
    }

    @Override
    public String toString() {
        return "Material = " + material + ", Thickness = " + thickness + ", Texture = " + texture + ", Carrying Strap = " + carryingStrap;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof YogaMat) {
            YogaMat mat = (YogaMat) obj;
            if (Objects.equals(this.material, mat.material) && Objects.equals(this.thickness, mat.thickness) && Objects.equals(this.texture, mat.texture) && Objects.equals(this.carryingStrap, mat.carryingStrap)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
