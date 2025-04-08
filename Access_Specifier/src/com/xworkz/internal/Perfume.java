package com.xworkz.god.internal;

public class Perfume {

    public Perfume() {
        System.out.println("no-parameter const of Perfume");
    }

    public void brand() {
        System.out.println("running getBrand in Perfume");
    }

    void fragrance() {
        System.out.println("running getFragrance in Perfume");
        quantity();
    }

    private void quantity() {
        System.out.println("running getQuantity in Perfume");
    }
}
