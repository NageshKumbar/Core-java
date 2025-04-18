package com.xworkz.internal;

public class Security {
    final String name;
    final String protection;
    public Security(String name, String protection) {
        this.name = name;
        this.protection = protection;
    }
    @Override public String toString() {
        return "Security [name=" + name + ", protection=" + protection + "]";
    }
}
