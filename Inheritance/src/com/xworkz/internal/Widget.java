package com.xworkz.internal;

public class Widget extends Products {
    public void qualityCheck() {
        System.out.println("Checking widget quality");
    }

    @Override
    public void make() {
        System.out.println("Manufacturing widget");
    }
}
