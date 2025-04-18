package com.xworkz.internal;

public class TVShow {
    final String name;
    final String category;
    public TVShow(String name, String category) {
        this.name = name;
        this.category = category;
    }
    @Override public String toString() {
        return "TVShow [name=" + name + ", category=" + category + "]";
    }
}
