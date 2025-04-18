package com.xworkz.internal;

public class Chair extends Furniture {
    public Chair(String piece, String style) {
        super(piece, style);
    }
    @Override public String toString() {
        return "Chair [piece=" + piece + ", style=" + style + "]";
    }
}