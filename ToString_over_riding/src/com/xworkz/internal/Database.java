package com.xworkz.internal;

public class Database {
    final String name;
    final String type;
    public Database(String name, String type) {
        this.name = name;
        this.type = type;
    }
    @Override public String toString() {
        return "Database [name=" + name + ", type=" + type + "]";
    }
}
