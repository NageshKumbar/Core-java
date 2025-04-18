package com.xworkz.internal;

public class Apple extends Fruit {
    public Apple(String name, String color) {
        super(name, color);
    }
    @Override public String toString() {
        return "Apple [name=" + name + ", color=" + color + "]";
    }
}