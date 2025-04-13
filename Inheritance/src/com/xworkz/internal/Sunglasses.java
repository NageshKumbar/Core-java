package com.xworkz.internal;

public class Sunglasses extends Glasses {
    public void adjustNosePads() {
        System.out.println("Adjusting nose pads");
    }

    @Override
    public void wear() {
        System.out.println("Wearing sunglasses");
    }
}
