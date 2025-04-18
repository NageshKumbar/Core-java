package com.xworkz.internal;

public class Eagle extends Bird {
    public Eagle(String species, String habitat) {
        super(species, habitat);
    }
    @Override public String toString() {
        return "Eagle [species=" + species + ", habitat=" + habitat + "]";
    }
}
