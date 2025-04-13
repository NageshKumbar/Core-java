package com.xworkz.internal;

public class Excavator extends Equipment4 {
    public void extendArm() {
        System.out.println("Extending excavator arm");
    }

    @Override
    public void dig() {
        System.out.println("Digging with excavator");
    }
}
