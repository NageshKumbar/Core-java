package com.xworkz.internal;

public class Drill extends Tool {
    public void changeBur() {
        System.out.println("Changing drill bur");
    }

    @Override
    public void use() {
        System.out.println("Using dental drill");
    }
}
