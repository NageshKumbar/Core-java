package com.xworkz.internal;

public class Sweater extends Project {
    public void seam() {
        System.out.println("Seaming sweater pieces");
    }

    @Override
    public void knit() {
        System.out.println("Knitting sweater");
    }
}