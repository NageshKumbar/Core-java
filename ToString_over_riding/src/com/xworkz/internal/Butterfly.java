package com.xworkz.internal;

public class Butterfly extends Insect {
    public Butterfly(String name, String color) {
        super(name, color);
    }
    @Override public String toString() {
        return "Butterfly [name=" + name + ", color=" + color + "]";
    }
}
