package com.xworkz.internal;

public class Guitar extends Instrument {
    public Guitar(String name, String family) {
        super(name, family);
    }
    @Override public String toString() {
        return "Guitar [name=" + name + ", family=" + family + "]";
    }
}
