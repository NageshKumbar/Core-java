package com.xworkz.internal;

public class App {
    final String name;
    final String category;
    public App(String name, String category) {
        this.name = name;
        this.category = category;
    }
    @Override public String toString() {
        return "App [name=" + name + ", category=" + category + "]";
    }
}
