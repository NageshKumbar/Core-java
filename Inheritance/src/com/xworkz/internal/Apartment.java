package com.xworkz.internal;

public class Apartment extends Property {
    public void signLease() {
        System.out.println("Signing apartment lease");
    }

    @Override
    public void sell() {
        System.out.println("Selling apartment unit");
    }
}