package com.xworkz.internal;

public class Printer extends Equipment1 {
    public void loadPaper() {
        System.out.println("Loading printer paper");
    }

    @Override
    public void use() {
        System.out.println("Using printer");
    }
}
