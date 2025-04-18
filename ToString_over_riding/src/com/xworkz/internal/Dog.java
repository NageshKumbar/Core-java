package com.xworkz.internal;

public class Dog extends Animal {
    public Dog(String species, String habitat) {
        super(species, habitat);
    }
    @Override public String toString() {
        return "Dog [species=" + species + ", habitat=" + habitat + "]";
    }
}
