package com.xworkz.internal;

public class Table extends Furniture{
    @Override
    public void ridge() {
        System.out.println("overridden method ridge in table");
    }

    @Override
    public void waterProof() {
        super.waterProof();
    }
}