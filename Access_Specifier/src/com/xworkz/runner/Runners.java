package com.xworkz.god.runner;

import com.xworkz.god.external.*;
import com.xworkz.god.internal.*;

public class Runners {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        River river = new River();

        Crab crab = new Crab();
        Snail snail = new Snail();

        Wallet wallet = new Wallet();
        Player player = new Player();

        Bag bag = new Bag();
        Person person = new Person();

        Box box = new Box();
        Face face = new Face();

        ChurchCross churchCross=new ChurchCross();
        churchCross.Cross();
        Jesus jesus=new Jesus();
        jesus.run();
        HorseRiding horseRiding = new HorseRiding();
        horseRiding.Horse();
        Boat boat=new Boat();
        boat.swim();
        Year year=new Year();
        year.symbol();
        Coin coin=new Coin();
        coin.head();
        Flight flight=new Flight();
        flight.processor();
        ExDrone exDrone=new ExDrone();
        exDrone.run();
        HairStyle hairStyle=new HairStyle();
        hairStyle.rubberBand();
        CombShape combShape=new CombShape();
        combShape.run();
        Trust trust=new Trust();
        trust.money();
    }

}
