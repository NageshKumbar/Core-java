package com.xworkz.internal;

import java.util.Objects;

public class FryingPan {
    String material;
    double size;
    boolean nonStick;
    boolean induction;

    public FryingPan(String material, double size, boolean nonStick, boolean induction) {
        this.material = material;
        this.size = size;
        this.nonStick = nonStick;
        this.induction = induction;
    }

    @Override
    public String toString() {
        return "Material = " + material + ", Size = " + size + ", Non-Stick = " + nonStick + ", Induction = " + induction;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof FryingPan) {
            FryingPan pan = (FryingPan) obj;
            if (Objects.equals(this.material, pan.material) && Objects.equals(this.size, pan.size) && Objects.equals(this.nonStick, pan.nonStick) && Objects.equals(this.induction, pan.induction)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
