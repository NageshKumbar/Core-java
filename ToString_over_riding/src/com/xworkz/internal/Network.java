package com.xworkz.internal;

public class Network {
    final String name;
    final String technology;
    public Network(String name, String technology) {
        this.name = name;
        this.technology = technology;
    }
    @Override public String toString() {
        return "Network [name=" + name + ", technology=" + technology + "]";
    }
}