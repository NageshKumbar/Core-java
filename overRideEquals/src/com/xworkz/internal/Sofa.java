package com.xworkz.internal;

import java.util.Objects;

public class Sofa {
    String material;
    String color;
    int seats;
    boolean reclining;

    public Sofa(String material, String color, int seats, boolean reclining) {
        this.material = material;
        this.color = color;
        this.seats = seats;
        this.reclining = reclining;
    }

    @Override
    public String toString() {
        return "Material = " + material + ", Color = " + color + ", Seats = " + seats + ", Reclining = " + reclining;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Sofa) {
            Sofa sofa = (Sofa) obj;
            if (Objects.equals(this.material, sofa.material) && Objects.equals(this.color, sofa.color) && Objects.equals(this.seats, sofa.seats) && Objects.equals(this.reclining, sofa.reclining)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}

