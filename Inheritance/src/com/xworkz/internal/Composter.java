package com.xworkz.internal;

public class Composter extends System2 {
    public void turnPile() {
        System.out.println("Turning compost pile");
    }

    @Override
    public void process() {
        System.out.println("Composting organic waste");
    }
}
