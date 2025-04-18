package com.xworkz.internal;

import java.util.Objects;

public class Lamp {
    String type;
    String bulbType;
    boolean dimmable;
    boolean smart;

    public Lamp(String type, String bulbType, boolean dimmable, boolean smart) {
        this.type = type;
        this.bulbType = bulbType;
        this.dimmable = dimmable;
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Type = " + type + ", Bulb Type = " + bulbType + ", Dimmable = " + dimmable + ", Smart = " + smart;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Lamp) {
            Lamp lamp = (Lamp) obj;
            if (Objects.equals(this.type, lamp.type) && Objects.equals(this.bulbType, lamp.bulbType) && Objects.equals(this.dimmable, lamp.dimmable) && Objects.equals(this.smart, lamp.smart)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}