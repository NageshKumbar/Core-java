package com.xworkz.internal;

public class Dance {
    final String style;
    final String origin;
    public Dance(String style, String origin) {
        this.style = style;
        this.origin = origin;
    }
    @Override public String toString() {
        return "Dance [style=" + style + ", origin=" + origin + "]";
    }
}
