package com.xworkz.internal;

public class Doll extends Toy {
    public void changeClothes() {
        System.out.println("Changing doll's clothes");
    }

    @Override
    public void play() {
        System.out.println("Playing with doll");
    }
}
