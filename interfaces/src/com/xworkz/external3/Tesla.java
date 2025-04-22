package com.xworkz.external3;

import com.xworkz.internal.rules3.VehicleControl;

public class Tesla implements VehicleControl {
    public void startEngine() { System.out.println("Tesla engine started"); }
    public void stopEngine() { System.out.println("Tesla engine stopped"); }
    public void accelerate() { System.out.println("Tesla accelerating"); }
    public void brake() { System.out.println("Tesla braking"); }
    public void steer() { System.out.println("Tesla steering"); }
    public void honk() { System.out.println("Tesla honking"); }
    public void fuelStatus() { System.out.println("Battery status shown"); }
}