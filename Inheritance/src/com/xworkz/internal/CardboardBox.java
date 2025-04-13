package com.xworkz.internal;

public class CardboardBox extends Material1 {
    public void sealTape() {
        System.out.println("Sealing box with tape");
    }

    @Override
    public void contain() {
        System.out.println("Containing items in cardboard box");
    }
}
