package com.xworkz.internal;

public class BuildingInternal {
    public void runInternal(){
        Apartment apartment= new Apartment();

        System.out.println("----------after updated---------");
        apartment.setDinning("Dinning table");
        apartment.setPlayground("children ground");
        apartment.setSecurity("Safe security");
        apartment.setPenthouse("Pent house");
        apartment.setArchitecture("Building architecture");
        System.out.println(apartment.getDinning());
        System.out.println(apartment.getPlayground());
        System.out.println(apartment.getSecurity());
        System.out.println(apartment.getPenthouse());
        System.out.println(apartment.getArchitecture());
    }
}
