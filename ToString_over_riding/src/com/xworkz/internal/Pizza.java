package com.xworkz.internal;

public class Pizza extends Food {
    public Pizza(String dish, String cuisine) {
        super(dish, cuisine);
    }
    @Override public String toString() {
        return "Pizza [dish=" + dish + ", cuisine=" + cuisine + "]";
    }
}
