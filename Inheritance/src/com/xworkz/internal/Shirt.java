package com.xworkz.internal;

public class Shirt extends Garment {
    public void buttonUp() {
        System.out.println("Buttoning shirt");
    }

    @Override
    public void wear() {
        System.out.println("Wearing shirt");
    }
}

