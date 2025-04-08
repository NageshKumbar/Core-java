package com.xworkz.god.external;

import com.xworkz.god.internal.Perfume;

public class Person {

    Perfume perfume = new Perfume();

    public Person() {
        System.out.println("no-parameter const of Person");
        perfume.brand();
    }
}