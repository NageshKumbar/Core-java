package com.xworkz.internal;

public class UltraCoffeeMaker extends CoffeeMaker{
    public UltraCoffeeMaker(){
        System.out.println("Running UltraCoffeeMaker const");
    }
@Override
    public void usecoffe(){
    System.out.println("Running the overrided usecoffe method in the subclass");
}
public void maincoffee(){
    System.out.println("Running the maincoffee methdod in the subclass");
}
}
