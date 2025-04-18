package com.xworkz.internal;

public class Windows extends OperatingSystem {
    public Windows(String name, String developer) {
        super(name, developer);
    }
    @Override public String toString() {
        return "Windows [name=" + name + ", developer=" + developer + "]";
    }
}

