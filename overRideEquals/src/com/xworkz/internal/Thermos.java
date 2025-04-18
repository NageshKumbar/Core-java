package com.xworkz.internal;

import java.util.Objects;

public class Thermos {
    String material;
    double capacity;
    boolean insulation;
    boolean leakProof;

    public Thermos(String material, double capacity, boolean insulation, boolean leakProof) {
        this.material = material;
        this.capacity = capacity;
        this.insulation = insulation;
        this.leakProof = leakProof;
    }

    @Override
    public String toString() {
        return "Material = " + material + ", Capacity = " + capacity + ", Insulation = " + insulation + ", Leak Proof = " + leakProof;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Thermos) {
            Thermos thermos = (Thermos) obj;
            if (Objects.equals(this.material, thermos.material) && Objects.equals(this.capacity, thermos.capacity) && Objects.equals(this.insulation, thermos.insulation) && Objects.equals(this.leakProof, thermos.leakProof)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}