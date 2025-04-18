package com.xworkz.internal;

public class Snake extends Reptile {
    public Snake(String name, String environment) {
        super(name, environment);
    }
    @Override public String toString() {
        return "Snake [name=" + name + ", environment=" + environment + "]";
    }
}
