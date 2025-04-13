package com.xworkz.internal;

public class Handbag extends Accessory {
    public void organize() {
        System.out.println("Organizing handbag");
    }

    @Override
    public void wear() {
        System.out.println("Carrying handbag");
    }
}
