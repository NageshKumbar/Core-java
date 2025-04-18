package com.xworkz.internal;

public class Ballet extends Dance {
    public Ballet(String style, String origin) {
        super(style, origin);
    }
    @Override public String toString() {
        return "Ballet [style=" + style + ", origin=" + origin + "]";
    }
}