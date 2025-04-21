package com.xworkz.runner;

import com.xworkz.internal.*;


public class InternalRunner {
    public static void main(String[] args) {
        Footware footware = new Shoe();
        footware.bata();

        Watch watch= new Quartz();
        watch.hmt();

        Furniture furniture=new Table();
        furniture.ridge();
        furniture.waterProof();

        Vehicle vehicle = new Bike();
        vehicle.info();

        Appliances appliances= new Machines();
        appliances.fridge();
        appliances.microwaveOven();
        appliances.television();
        appliances.washingMachine();
    }
}