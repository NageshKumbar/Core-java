package com.xworkz.internal;

public class DSLRCamera extends Camera {
    public void changeLens() {
        System.out.println("Changing DSLR lens");
    }
    @Override
    public void capture() {
        System.out.println("Capturing high-quality DSLR image");
    }
}