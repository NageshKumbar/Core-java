package com.methods.cigarrete;

public class Smoke {

    Cigarrete cigarrete;

    public Smoke(Cigarrete cigarrete) {
        this.cigarrete = cigarrete;
        System.out.println("parameterized constructor in smoke");
    }

    public void smoking() {
        System.out.println("running smoking in smoke");
        if (cigarrete != null) {
            cigarrete.weed();
        }
        else {
            System.err.println("cigarrete is null");
        }
    }
}
