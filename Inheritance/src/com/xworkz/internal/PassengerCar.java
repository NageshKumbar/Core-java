package com.xworkz.internal;

public class PassengerCar extends Carriage {
    public void checkTickets() {
        System.out.println("Checking passenger tickets");
    }

    @Override
    public void carry() {
        System.out.println("Carrying passengers");
    }
}