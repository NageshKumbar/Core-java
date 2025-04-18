package com.xworkz.internal;

public class Insect {
    final String name;
    final String color;
    public Insect(String name, String color) {
        this.name = name;
        this.color = color;
    }
    @Override public String toString() {
        return "Insect [name=" + name + ", color=" + color + "]";
    }
}
