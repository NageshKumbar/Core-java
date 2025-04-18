package com.xworkz.internal;

public class Instrument {
    final String name;
    final String family;
    public Instrument(String name, String family) {
        this.name = name;
        this.family = family;
    }
    @Override public String toString() {
        return "Instrument [name=" + name + ", family=" + family + "]";
    }
}
