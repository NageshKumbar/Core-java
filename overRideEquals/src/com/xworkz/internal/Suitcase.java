package com.xworkz.internal;

import java.util.Objects;

public class Suitcase {
    String material;
    String size;
    boolean wheels;
    boolean tsaLock;

    public Suitcase(String material, String size, boolean wheels, boolean tsaLock) {
        this.material = material;
        this.size = size;
        this.wheels = wheels;
        this.tsaLock = tsaLock;
    }

    @Override
    public String toString() {
        return "Material = " + material + ", Size = " + size + ", Wheels = " + wheels + ", TSA Lock = " + tsaLock;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Suitcase) {
            Suitcase suitcase = (Suitcase) obj;
            if (Objects.equals(this.material, suitcase.material) && Objects.equals(this.size, suitcase.size) && Objects.equals(this.wheels, suitcase.wheels) && Objects.equals(this.tsaLock, suitcase.tsaLock)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
