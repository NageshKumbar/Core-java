package com.xworkz.internal;

public class Desktop extends Computer {
    public Desktop(String type, String os) {
        super(type, os);
    }
    @Override public String toString() {
        return "Desktop [type=" + type + ", os=" + os + "]";
    }
}
