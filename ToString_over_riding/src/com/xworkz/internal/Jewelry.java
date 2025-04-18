package com.xworkz.internal;

public class Jewelry {
    final String piece;
    final String metal;
    public Jewelry(String piece, String metal) {
        this.piece = piece;
        this.metal = metal;
    }
    @Override public String toString() {
        return "Jewelry [piece=" + piece + ", metal=" + metal + "]";
    }
}
