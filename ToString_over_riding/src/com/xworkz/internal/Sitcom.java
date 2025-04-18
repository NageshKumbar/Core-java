package com.xworkz.internal;

public class Sitcom extends TVShow {
    public Sitcom(String name, String category) {
        super(name, category);
    }
    @Override public String toString() {
        return "Sitcom [name=" + name + ", category=" + category + "]";
    }
}