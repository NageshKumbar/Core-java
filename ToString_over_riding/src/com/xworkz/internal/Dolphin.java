package com.xworkz.internal;

public class Dolphin extends Mammal {
    public Dolphin(String name, String feature) {
        super(name, feature);
    }
    @Override public String toString() {
        return "Dolphin [name=" + name + ", feature=" + feature + "]";
    }
}
