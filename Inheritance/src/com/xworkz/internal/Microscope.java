package com.xworkz.internal;

public class Microscope extends Equipment2 {
    public void adjustFocus() {
        System.out.println("Adjusting microscope focus");
    }

    @Override
    public void operate() {
        System.out.println("Operating microscope");
    }
}