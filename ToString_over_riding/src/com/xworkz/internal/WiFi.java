package com.xworkz.internal;

public class WiFi extends Network {
    public WiFi(String name, String technology) {
        super(name, technology);
    }
    @Override public String toString() {
        return "WiFi [name=" + name + ", technology=" + technology + "]";
    }
}

