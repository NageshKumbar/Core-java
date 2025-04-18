package com.xworkz.internal;

import java.util.Objects;

public class Calculator {
    String brand;
    String type;
    boolean solarPowered;
    boolean programmable;

    public Calculator(String brand, String type, boolean solarPowered, boolean programmable) {
        this.brand = brand;
        this.type = type;
        this.solarPowered = solarPowered;
        this.programmable = programmable;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Type = " + type + ", Solar Powered = " + solarPowered + ", Programmable = " + programmable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Calculator) {
            Calculator calculator = (Calculator) obj;
            if (Objects.equals(this.brand, calculator.brand) && Objects.equals(this.type, calculator.type) && Objects.equals(this.solarPowered, calculator.solarPowered) && Objects.equals(this.programmable, calculator.programmable)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}