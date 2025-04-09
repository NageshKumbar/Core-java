package com.xworkz.external;

import com.xworkz.internal.Garage;

public class GarageExternal {
            public void run() {
                Garage garage = new Garage();
                System.out.println(garage.getHammer());
                System.out.println(garage.getScrewdriver());
                System.out.println(garage.getCar());
                System.out.println(garage.getOilStorage());
                System.out.println(garage.getAirCompressor());
            }
}
