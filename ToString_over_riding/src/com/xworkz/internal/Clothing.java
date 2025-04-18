package com.xworkz.internal;

public class Clothing {
    final String item;
    final String material;
    public Clothing(String item, String material) {
        this.item = item;
        this.material = material;
    }
    @Override public String toString() {
        return "Clothing [item=" + item + ", material=" + material + "]";
    }
}
