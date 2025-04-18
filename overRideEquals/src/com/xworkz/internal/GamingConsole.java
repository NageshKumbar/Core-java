package com.xworkz.internal;

import java.util.Objects;

public class GamingConsole {
    String brand;
    int storage;
    String generation;
    boolean vrReady;

    public GamingConsole(String brand, int storage, String generation, boolean vrReady) {
        this.brand = brand;
        this.storage = storage;
        this.generation = generation;
        this.vrReady = vrReady;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Storage = " + storage + ", Generation = " + generation + ", VR Ready = " + vrReady;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof GamingConsole) {
            GamingConsole console = (GamingConsole) obj;
            if (Objects.equals(this.brand, console.brand) && Objects.equals(this.storage, console.storage) && Objects.equals(this.generation, console.generation) && Objects.equals(this.vrReady, console.vrReady)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}