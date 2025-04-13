package com.xworkz.internal;

public class DogFood extends Product2 {
    public void measurePortion() {
        System.out.println("Measuring dog food portion");
    }

    @Override
    public void use() {
        System.out.println("Feeding dog");
    }
}