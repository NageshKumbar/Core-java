package com.xworkz.god.internal;

public class Powder {

    public Powder() {
        System.out.println("no-parameter const of Powder");
    }

    public void getBrand() {
        System.out.println("running getBrand in Powder");
    }

    void flavor() {
        System.out.println("running getFlavor in Powder");
        weight();
    }

    private void weight() {
        System.out.println("running getWeight in Powder");
    }
}
