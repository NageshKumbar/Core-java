package com.xworkz.god.internal;

public class Box {

    Powder powder = new Powder();

    public Box() {
        System.out.println("no-parameter const in Box");
        powder.flavor();
    }
}
