package com.xworkz.internal;

public class GarageInternal {
    public void runInternal() {
        Garage garage = new Garage();
        System.out.println("-------- After updating Garage --------");
        garage.setScrewdriver("Screw Jack");
        garage.setHammer("Hammer");
        garage.setCar("Electric car");
        garage.setOilStorage("Barrels");
        garage.setAirCompressor("Bosch Air Compressor");

        System.out.println(garage.getScrewdriver());
        System.out.println(garage.getHammer());
        System.out.println(garage.getCar());
        System.out.println(garage.getOilStorage());
        System.out.println(garage.getAirCompressor());
    }
}
