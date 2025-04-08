package com.methods.sweet;

public class Boondhi {
    Sweet sweet;
    public Boondhi(Sweet sweet1) {
        this.sweet=sweet1;
        System.out.println("Parameterized contructor in Boondhi");

    }

    public void Dessert() {
        System.out.println("Running Dessert in Boondhi");
        if(sweet!=null){
            sweet.colour();
        }
        else{
            System.err.println("sweet is null in the method");
        }

    }
}