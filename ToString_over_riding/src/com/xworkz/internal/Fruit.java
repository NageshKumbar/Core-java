package com.xworkz.internal;

public class Fruit {
    final String name;
    final String color;
    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }
    @Override public String toString() {
        return "Fruit [name=" + name + ", color=" + color + "]";
    }
}