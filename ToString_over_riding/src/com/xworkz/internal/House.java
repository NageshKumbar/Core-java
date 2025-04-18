package com.xworkz.internal;

public class House extends Building {
    public House(String structure, String location) {
        super(structure, location);
    }
    @Override public String toString() {
        return "House [structure=" + structure + ", location=" + location + "]";
    }
}
