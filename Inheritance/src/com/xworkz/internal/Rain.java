package com.xworkz.internal;

public class Rain extends Phenomenon {
    public void measureRainfall() {
        System.out.println("Measuring rainfall");
    }

    @Override
    public void occur() {
        System.out.println("It's raining");
    }
}