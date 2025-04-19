package com.xworkz.external;

import java.util.Objects;

public class Plant {
    String name;
    String type;
    String potSize;
    boolean flowering;

    public void setPlant(String name, String type, String potSize, boolean flowering) {
        this.name = name;
        this.type = type;
        this.potSize = potSize;
        this.flowering = flowering;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", Type = " + type + ", PotSize = " + potSize + ", Flowering = " + flowering;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Plant) {
            Plant plant = (Plant) obj;
            if (Objects.equals(this.name, plant.name) && Objects.equals(this.type, plant.type) && Objects.equals(this.potSize, plant.potSize) && Objects.equals(this.flowering, plant.flowering)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
