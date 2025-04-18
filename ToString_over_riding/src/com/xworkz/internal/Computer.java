package com.xworkz.internal;

public class Computer {
    final String type;
    final String os;
    public Computer(String type, String os) {
        this.type = type;
        this.os = os;
    }
    @Override public String toString() {
        return "Computer [type=" + type + ", os=" + os + "]";
    }
}
