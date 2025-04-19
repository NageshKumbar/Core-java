package com.xworkz.external;

import java.util.Objects;

public class Skateboard {
    String brand;
    String deckSize;
    String truckType;
    String wheelHardness;

    public void setSkateboard(String brand, String deckSize, String truckType, String wheelHardness) {
        this.brand = brand;
        this.deckSize = deckSize;
        this.truckType = truckType;
        this.wheelHardness = wheelHardness;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", DeckSize = " + deckSize + ", TruckType = " + truckType + ", WheelHardness = " + wheelHardness;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Skateboard) {
            Skateboard skateboard = (Skateboard) obj;
            if (Objects.equals(this.brand, skateboard.brand) && Objects.equals(this.deckSize, skateboard.deckSize) && Objects.equals(this.truckType, skateboard.truckType) && Objects.equals(this.wheelHardness, skateboard.wheelHardness)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}


