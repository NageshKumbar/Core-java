package com.xworkz.god.runner;

import com.xworkz.god.external.Boat;
import com.xworkz.god.external.CombShape;
import com.xworkz.god.external.ExDrone;
import com.xworkz.god.external.Jesus;
import com.xworkz.god.internal.*;

public class Runners {
    public static void main(String[] args) {
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
    }

}
