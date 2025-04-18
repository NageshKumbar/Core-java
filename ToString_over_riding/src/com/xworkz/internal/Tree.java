package com.xworkz.internal;

public class Tree extends Plant {
    public Tree(String name, String type) {
        super(name, type);
    }
    @Override public String toString() {
        return "Tree [name=" + name + ", type=" + type + "]";
    }
}
