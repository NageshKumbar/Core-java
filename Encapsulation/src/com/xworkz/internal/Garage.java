package com.xworkz.internal;

public class Garage {
    private String screwdriver;
    private String hammer;
    private String car;
    private String oilStorage;
    private String airCompressor;

    void setScrewdriver(String screwdriver) {
        this.screwdriver = screwdriver;
    }

    void setHammer(String hammer) {
        this.hammer = hammer;
    }

    void setCar(String car) {
        this.car = car;
    }

    void setOilStorage(String oilStorage) {
        this.oilStorage = oilStorage;
    }

    void setAirCompressor(String airCompressor) {
        this.airCompressor = airCompressor;
    }

    public String getScrewdriver() {
        return this.screwdriver;
    }

    public String getHammer() {
        return this.hammer;
    }

    public String getCar() {
        return this.car;
    }

    public String getOilStorage() {
        return this.oilStorage;
    }

    public String getAirCompressor() {
        return this.airCompressor;
    }
}
