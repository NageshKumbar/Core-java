package com.xworkz.internal;

public class Chair extends Itemz {
    public void adjustHeight() {
        System.out.println("Adjusting chair height");
    }

    @Override
    public void use() {
        System.out.println("Using chair");
    }
}