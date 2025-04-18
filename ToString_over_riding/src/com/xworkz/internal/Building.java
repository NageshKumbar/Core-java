package com.xworkz.internal;

public class Building {
    final String structure;
    final String location;
    public Building(String structure, String location) {
        this.structure = structure;
        this.location = location;
    }
    @Override public String toString() {
        return "Building [structure=" + structure + ", location=" + location + "]";
    }
}
