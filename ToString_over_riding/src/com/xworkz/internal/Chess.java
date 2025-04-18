package com.xworkz.internal;

public class Chess extends Game {
    public Chess(String name, String type) {
        super(name, type);
    }
    @Override public String toString() {
        return "Chess [name=" + name + ", type=" + type + "]";
    }
}
