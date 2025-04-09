package com.xworkz.internal;

public class Mutent {
    private String name;
    private String power;
    private String type;
    private String isHero;
    private String weapon;

    void setName(String name) {
        this.name = name;
    }
    void setPower(String power) {
        this.power = power;
    }
    void setType(String type) {
        this.type = type;
    }
    void setIsHero(String isHero) {
        this.isHero = isHero;
    }
    void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return this.name;
    }
    public String getPower() {
        return this.power;
    }
    public String getType() {
        return this.type;
    }
    public String getIsHero() {
        return this.isHero;
    }
    public String getWeapon() {
        return this.weapon;
    }
}
