package com.xworkz.internal;

public class Plant {
    final String name;
    final String type;
    public Plant(String name, String type) {
        this.name = name;
        this.type = type;
    }
    @Override public String toString() {
        return "Plant [name=" + name + ", type=" + type + "]";
    }
}