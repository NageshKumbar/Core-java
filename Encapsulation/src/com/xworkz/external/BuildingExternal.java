package com.xworkz.external;

import com.xworkz.internal.Apartment;

public class BuildingExternal {
    public void run(){
        Apartment apartment= new Apartment();
        System.out.println(apartment.getDinning());
        System.out.println(apartment.getPlayground());
        System.out.println(apartment.getSecurity());
        System.out.println(apartment.getPenthouse());
        System.out.println(apartment.getArchitecture());
    }
}
