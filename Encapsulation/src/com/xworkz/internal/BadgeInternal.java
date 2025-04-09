package com.xworkz.internal;

public class BadgeInternal {
    public void runInternal(){
        Badge badge = new Badge();

        System.out.println("----------after updated---------");
        badge.setBadgeName("Gold Star");
        badge.setBadgeColor("Golden");
        badge.setBadgeLevel("Expert");
        badge.setBadgeShape("Circular");
        badge.setBadgeMaterial("Metal");

        System.out.println(badge.getBadgeName());
        System.out.println(badge.getBadgeColor());
        System.out.println(badge.getBadgeLevel());
        System.out.println(badge.getBadgeShape());
        System.out.println(badge.getBadgeMaterial());
    }

}
