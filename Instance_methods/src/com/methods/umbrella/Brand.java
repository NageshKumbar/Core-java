package com.methods.umbrella;

public class Brand {

    Umbrella umbrella;
    public Brand(Umbrella umbrella) {
        this.umbrella = umbrella;
        System.out.println("parameterized constructor in brand");
    }

    public void price() {
        System.out.println("running price in brand");
        if (umbrella != null) {
            umbrella.rainDance();
        }
        else {
            System.err.println("umbrella is null");
        }
    }
}
