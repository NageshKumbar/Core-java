package com.xworkz.internal;

public class Clay extends Material {
    public void wedge() {
        System.out.println("Wedging clay");
    }

    @Override
    public void shape() {
        System.out.println("Shaping clay");
    }
}