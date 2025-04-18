package com.xworkz.internal;

public class Shirt extends Clothing {
    public Shirt(String item, String material) {
        super(item, material);
    }
    @Override public String toString() {
        return "Shirt [item=" + item + ", material=" + material + "]";
    }
}