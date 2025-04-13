package com.xworkz.internal;

public class Wallet extends Product3 {
    public void stitchSeams() {
        System.out.println("Stitching wallet seams");
    }

    @Override
    public void craft() {
        System.out.println("Crafting leather wallet");
    }
}