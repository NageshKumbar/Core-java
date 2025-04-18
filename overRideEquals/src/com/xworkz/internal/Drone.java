package com.xworkz.internal;

import java.util.Objects;

public class Drone {
    String brand;
    String cameraResolution;
    int flightTime;
    boolean gps;

    public Drone(String brand, String cameraResolution, int flightTime, boolean gps) {
        this.brand = brand;
        this.cameraResolution = cameraResolution;
        this.flightTime = flightTime;
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Camera Resolution = " + cameraResolution + ", Flight Time = " + flightTime + ", GPS = " + gps;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Drone) {
            Drone drone = (Drone) obj;
            if (Objects.equals(this.brand, drone.brand) && Objects.equals(this.cameraResolution, drone.cameraResolution) && Objects.equals(this.flightTime, drone.flightTime) && Objects.equals(this.gps, drone.gps)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
