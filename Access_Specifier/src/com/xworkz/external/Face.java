package com.xworkz.god.external;

import com.xworkz.god.internal.Powder;

public class Face {

    Powder powder = new Powder();

    public Face() {
        System.out.println("no-parameter const of Face");
        powder.getBrand();
    }
}
