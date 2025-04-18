package com.xworkz.internal;

import java.util.Objects;

public class AlarmClock {
    String brand;
    String display;
    boolean radio;
    boolean usbPort;

    public AlarmClock(String brand, String display, boolean radio, boolean usbPort) {
        this.brand = brand;
        this.display = display;
        this.radio = radio;
        this.usbPort = usbPort;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Display = " + display + ", Radio = " + radio + ", USB Port = " + usbPort;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof AlarmClock) {
            AlarmClock clock = (AlarmClock) obj;
            if (Objects.equals(this.brand, clock.brand) && Objects.equals(this.display, clock.display) && Objects.equals(this.radio, clock.radio) && Objects.equals(this.usbPort, clock.usbPort)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}

