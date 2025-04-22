package com.xworkz.external3;

import com.xworkz.internal.rules3.SmartDevices;

public class Alexa implements SmartDevices {
    public void turnOn() { System.out.println("Alexa turned on"); }
    public void turnOff() { System.out.println("Alexa turned off"); }
    public void restart() { System.out.println("Alexa restarted"); }
    public void connect() { System.out.println("Alexa connected"); }
    public void disconnect() { System.out.println("Alexa disconnected"); }
    public void update() { System.out.println("Alexa updated"); }
    public void diagnose() { System.out.println("Alexa diagnosis started"); }
}