package com.xworkz.internal;

public class Cameras extends Equipment6 {
    public void adjustFocus() {
        System.out.println("Adjusting camera focus");
    }

    @Override
    public void record() {
        System.out.println("Recording with camera");
    }
}