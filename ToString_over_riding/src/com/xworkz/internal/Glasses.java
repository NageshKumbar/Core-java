package com.xworkz.internal;

public class Glasses extends AR {
    public Glasses(String tech, String use) {
        super(tech, use);
    }
    @Override public String toString() {
        return "Glasses [tech=" + tech + ", use=" + use + "]";
    }
}
