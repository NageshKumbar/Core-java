package com.xworkz.external;

import java.util.Objects;

public class Guitar {
    String brand;
    String type;
    int strings;
    String color;

    public void setGuitar(String brand, String type, int strings, String color) {
        this.brand = brand;
        this.type = type;
        this.strings = strings;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Type = " + type + ", Strings = " + strings + ", Color = " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Guitar) {
            Guitar guitar = (Guitar) obj;
            if (Objects.equals(this.brand, guitar.brand) && Objects.equals(this.type, guitar.type) && Objects.equals(this.strings, guitar.strings) && Objects.equals(this.color, guitar.color)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
