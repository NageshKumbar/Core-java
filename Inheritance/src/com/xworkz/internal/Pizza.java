package com.xworkz.internal;

public class Pizza extends FoodItem {
    public void addToppings() {
        System.out.println("Adding pizza toppings");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing pizza dough");
    }
}