package com.xworkz.internal;

import java.util.Objects;

public class Umbrella {
    String type;
    String color;
    boolean automatic;
    boolean windResistant;

    public Umbrella(String type, String color, boolean automatic, boolean windResistant) {
        this.type = type;
        this.color = color;
        this.automatic = automatic;
        this.windResistant = windResistant;
    }

    @Override
    public String toString() {
        return "Type = " + type + ", Color = " + color + ", Automatic = " + automatic + ", Wind Resistant = " + windResistant;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Umbrella) {
            Umbrella umbrella = (Umbrella) obj;
            if (Objects.equals(this.type, umbrella.type) && Objects.equals(this.color, umbrella.color) && Objects.equals(this.automatic, umbrella.automatic) && Objects.equals(this.windResistant, umbrella.windResistant)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}