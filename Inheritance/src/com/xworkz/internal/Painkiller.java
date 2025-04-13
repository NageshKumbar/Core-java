package com.xworkz.internal;

public class Painkiller extends Medicine {
    public void checkDosage() {
        System.out.println("Checking painkiller dosage");
    }

    @Override
    public void treat() {
        System.out.println("Relieving pain");
    }
}