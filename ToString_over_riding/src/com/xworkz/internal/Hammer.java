package com.xworkz.internal;

public class Hammer extends Tool {
    public Hammer(String name, String use) {
        super(name, use);
    }
    @Override public String toString() {
        return "Hammer [name=" + name + ", use=" + use + "]";
    }
}
