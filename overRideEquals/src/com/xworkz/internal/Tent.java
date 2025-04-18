package com.xworkz.internal;

import java.util.Objects;

public class Tent {
    int capacity;
    String seasonRating;
    double weight;
    boolean freestanding;

    public Tent(int capacity, String seasonRating, double weight, boolean freestanding) {
        this.capacity = capacity;
        this.seasonRating = seasonRating;
        this.weight = weight;
        this.freestanding = freestanding;
    }

    @Override
    public String toString() {
        return "Capacity = " + capacity + ", Season Rating = " + seasonRating + ", Weight = " + weight + ", Freestanding = " + freestanding;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tent) {
            Tent tent = (Tent) obj;
            if (Objects.equals(this.capacity, tent.capacity) && Objects.equals(this.seasonRating, tent.seasonRating) && Objects.equals(this.weight, tent.weight) && Objects.equals(this.freestanding, tent.freestanding)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
