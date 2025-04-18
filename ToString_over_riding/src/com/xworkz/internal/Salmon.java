package com.xworkz.internal;

public class Salmon extends Fish {
    public Salmon(String type, String water) {
        super(type, water);
    }
    @Override public String toString() {
        return "Salmon [type=" + type + ", water=" + water + "]";
    }
}
