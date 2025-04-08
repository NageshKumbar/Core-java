package com.methods.liver;

public class Pancreas {

    Liver liver;
    public Pancreas(Liver liver) {
        this.liver = liver;
        System.out.println("parameterized const in pancreas");
    }

    public void secretion() {
        System.out.println("running secretion in pancreas");
        if (liver != null) {
            liver.bileDuct();
        }
        else {
            System.out.println("liver is null");
        }
    }

}
