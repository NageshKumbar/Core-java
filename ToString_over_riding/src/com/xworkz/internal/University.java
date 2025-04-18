package com.xworkz.internal;

public class University extends School {
    public University(String name, String level) {
        super(name, level);
    }
    @Override public String toString() {
        return "University [name=" + name + ", level=" + level + "]";
    }
}