package com.xworkz.internal;

public class Cotton extends Fabric {
    public void preWash() {
        System.out.println("Pre-washing cotton");
    }

    @Override
    public void weave() {
        System.out.println("Weaving cotton fabric");
    }
}

