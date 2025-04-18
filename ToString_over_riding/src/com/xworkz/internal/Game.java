package com.xworkz.internal;

public class Game {
    final String name;
    final String type;
    public Game(String name, String type) {
        this.name = name;
        this.type = type;
    }
    @Override public String toString() {
        return "Game [name=" + name + ", type=" + type + "]";
    }
}
