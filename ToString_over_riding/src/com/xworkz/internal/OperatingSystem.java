package com.xworkz.internal;

public class OperatingSystem {
    final String name;
    final String developer;
    public OperatingSystem(String name, String developer) {
        this.name = name;
        this.developer = developer;
    }
    @Override public String toString() {
        return "OperatingSystem [name=" + name + ", developer=" + developer + "]";
    }
}