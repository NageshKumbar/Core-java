package com.xworkz.internal;

public class Firewall extends Security {
    public Firewall(String name, String protection) {
        super(name, protection);
    }
    @Override public String toString() {
        return "Firewall [name=" + name + ", protection=" + protection + "]";
    }
}