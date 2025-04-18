package com.xworkz.internal;

public class Fish {
    final String type;
    final String water;
    public Fish(String type, String water) {
        this.type = type;
        this.water = water;
    }
    @Override public String toString() {
        return "Fish [type=" + type + ", water=" + water + "]";
    }
}
