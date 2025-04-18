package com.xworkz.internal;

public class SQL extends Database {
    public SQL(String name, String type) {
        super(name, type);
    }
    @Override public String toString() {
        return "SQL [name=" + name + ", type=" + type + "]";
    }
}

