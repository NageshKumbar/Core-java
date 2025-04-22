package com.xworkz.external2;

import com.xworkz.internal.rules2.SmartHome;

public class HomeAssistant implements SmartHome {
    public void turnOnLight() {
        System.out.println("Light turned on");
    }
    public void turnOffLight() {
        System.out.println("Light turned off");
    }
    public void openDoor() {
        System.out.println("Door opened");
    }
    public void closeDoor() {
        System.out.println("Door closed");
    }
    public void setTemperature() {
        System.out.println("Temperature set");
    }
}