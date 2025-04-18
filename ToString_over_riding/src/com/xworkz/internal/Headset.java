package com.xworkz.internal;

public class Headset extends VR {
    public Headset(String technology, String application) {
        super(technology, application);
    }
    @Override public String toString() {
        return "Headset [technology=" + technology + ", application=" + application + "]";
    }
}
