package com.xworkz.internal;

public class Ring extends Jewelry {
    public Ring(String piece, String metal) {
        super(piece, metal);
    }
    @Override public String toString() {
        return "Ring [piece=" + piece + ", metal=" + metal + "]";
    }
}
