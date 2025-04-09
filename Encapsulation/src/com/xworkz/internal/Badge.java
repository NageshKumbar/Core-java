package com.xworkz.internal;

public class Badge {
    private String badgeName;
    private String badgeColor;
    private String badgeLevel;
    private String badgeShape;
    private String badgeMaterial;


    void setBadgeName(String badgeName){
        this.badgeName = badgeName;
    }

    void setBadgeColor(String badgeColor){
        this.badgeColor = badgeColor;
    }

    void setBadgeLevel(String badgeLevel){
        this.badgeLevel = badgeLevel;
    }

    void setBadgeShape(String badgeShape){
        this.badgeShape = badgeShape;
    }

    void setBadgeMaterial(String badgeMaterial){
        this.badgeMaterial = badgeMaterial;
    }


    public String getBadgeName(){
        return this.badgeName;
    }

    public String getBadgeColor(){
        return this.badgeColor;
    }

    public String getBadgeLevel(){
        return this.badgeLevel;
    }

    public String getBadgeShape(){
        return this.badgeShape;
    }

    public String getBadgeMaterial(){
        return this.badgeMaterial;
    }
}
