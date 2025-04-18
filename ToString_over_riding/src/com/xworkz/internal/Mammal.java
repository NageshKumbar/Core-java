package com.xworkz.internal;

public class Mammal {
    final String name;
    final String feature;
    public Mammal(String name, String feature) {
        this.name = name;
        this.feature = feature;
    }
    @Override public String toString() {
        return "Mammal [name=" + name + ", feature=" + feature + "]";
    }
}
