package com.xworkz.internal;

public class Furniture {
    final String piece;
    final String style;
    public Furniture(String piece, String style) {
        this.piece = piece;
        this.style = style;
    }
    @Override public String toString() {
        return "Furniture [piece=" + piece + ", style=" + style + "]";
    }
}
