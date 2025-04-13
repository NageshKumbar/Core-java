package com.xworkz.internal;

public class Polymer extends Compound {
    public void catalyze() {
        System.out.println("Catalyzing polymerization");
    }

    @Override
    public void mix() {
        System.out.println("Mixing polymer compounds");
    }
}
