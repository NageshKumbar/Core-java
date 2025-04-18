package com.xworkz.internal;

import java.util.Objects;

public class Toolbox {
    String material;
    String size;
    int compartments;
    boolean lockable;

    public Toolbox(String material, String size, int compartments, boolean lockable) {
        this.material = material;
        this.size = size;
        this.compartments = compartments;
        this.lockable = lockable;
    }

    @Override
    public String toString() {
        return "Material = " + material + ", Size = " + size + ", Compartments = " + compartments + ", Lockable = " + lockable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Toolbox) {
            Toolbox toolbox = (Toolbox) obj;
            if (Objects.equals(this.material, toolbox.material) && Objects.equals(this.size, toolbox.size) && Objects.equals(this.compartments, toolbox.compartments) && Objects.equals(this.lockable, toolbox.lockable)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}

