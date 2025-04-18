package com.xworkz.internal;

public class Food {
    final String dish;
    final String cuisine;
    public Food(String dish, String cuisine) {
        this.dish = dish;
        this.cuisine = cuisine;
    }
    @Override public String toString() {
        return "Food [dish=" + dish + ", cuisine=" + cuisine + "]";
    }
}
