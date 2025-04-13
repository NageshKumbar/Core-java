package com.xworkz.internal;

public class Lighting extends Element1 {
    public void dim() {
        System.out.println("Dimming lights");
    }

    @Override
    public void arrange() {
        System.out.println("Arranging lighting");
    }
}