package com.xworkz.internal;

public class Jet {
     private String engineType;
     private String fuelCapacity;
     private String jetName;
     private String jetType;
     private String landingGear;

     void setEngineType(String engineType) {
         this.engineType = engineType;
     }

     void setFuelCapacity(String fuelCapacity) {
         this.fuelCapacity = fuelCapacity;
     }

     void setJetName(String jetName) {
         this.jetName = jetName;
     }

     void setJetType(String jetType) {
         this.jetType = jetType;
     }

     void setLandingGear(String landingGear) {
         this.landingGear = landingGear;
     }


     public String getEngineType() {
         return this.engineType;
     }

     public String getFuelCapacity() {
        return this.fuelCapacity;
     }

     public String getJetName() {
        return this.jetName;
     }

     public String getJetType() {
         return this.jetType;
     }

     public String getLandingGear() {
        return this.landingGear;
     }
}
