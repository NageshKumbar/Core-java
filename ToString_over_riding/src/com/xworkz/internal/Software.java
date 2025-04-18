package com.xworkz.internal;

public class Software {
    final String name;
    final String function;
    public Software(String name, String function) {
        this.name = name;
        this.function = function;
    }
    @Override public String toString() {
        return "Software [name=" + name + ", function=" + function + "]";
    }
}
