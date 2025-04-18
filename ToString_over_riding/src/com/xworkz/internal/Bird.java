package com.xworkz.internal;

public class Bird {
    final String species;
    final String habitat;
    public Bird(String species, String habitat) {
        this.species = species;
        this.habitat = habitat;
    }
    @Override public String toString() {
        return "Bird [species=" + species + ", habitat=" + habitat + "]";
    }
}
