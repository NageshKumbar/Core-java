package com.xworkz.internal;

public class School {
    final String name;
    final String level;
    public School(String name, String level) {
        this.name = name;
        this.level = level;
    }
    @Override public String toString() {
        return "School [name=" + name + ", level=" + level + "]";
    }
}
