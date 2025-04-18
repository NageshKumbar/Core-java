package com.xworkz.internal;

public class Animal {
    final String species;
    final String habitat;
    public Animal(String species, String habitat) {
        this.species = species;
        this.habitat = habitat;
    }
    @Override public String toString() {
        return "Animal [species=" + species + ", habitat=" + habitat + "]";
    }
}