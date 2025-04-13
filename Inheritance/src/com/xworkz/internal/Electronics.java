package com.xworkz.internal;

public class Electronics extends Product {
    public void checkWarranty() {
        System.out.println("Checking electronics warranty");
    }

    @Override
    public void display() {
        System.out.println("Displaying electronics product");
    }
}