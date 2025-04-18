package com.xworkz.internal;

import java.util.Objects;

public class Mouse {
    String brand;
    int dpi;
    boolean wireless;
    int buttons;

    public Mouse(String brand, int dpi, boolean wireless, int buttons) {
        this.brand = brand;
        this.dpi = dpi;
        this.wireless = wireless;
        this.buttons = buttons;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", DPI = " + dpi + ", Wireless = " + wireless + ", Buttons = " + buttons;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mouse) {
            Mouse mouse = (Mouse) obj;
            if (Objects.equals(this.brand, mouse.brand) && Objects.equals(this.dpi, mouse.dpi) && Objects.equals(this.wireless, mouse.wireless) && Objects.equals(this.buttons, mouse.buttons)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
