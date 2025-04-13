package com.xworkz.internal;

public class Necklace extends Piece {
    public void clasp() {
        System.out.println("Fastening necklace clasp");
    }

    @Override
    public void wear() {
        System.out.println("Wearing necklace");
    }
}
