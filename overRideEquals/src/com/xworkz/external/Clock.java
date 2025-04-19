package com.xworkz.external;

import java.util.Objects;

public class Clock {
    String brand;
    String type;
    boolean digital;
    boolean alarm;

    public void setClock(String brand, String type, boolean digital, boolean alarm) {
        this.brand = brand;
        this.type = type;
        this.digital = digital;
        this.alarm = alarm;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Type = " + type + ", Digital = " + digital + ", Alarm = " + alarm;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Clock) {
            Clock clock = (Clock) obj;
            if (Objects.equals(this.brand, clock.brand) && Objects.equals(this.type, clock.type) && Objects.equals(this.digital, clock.digital) && Objects.equals(this.alarm, clock.alarm)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}

