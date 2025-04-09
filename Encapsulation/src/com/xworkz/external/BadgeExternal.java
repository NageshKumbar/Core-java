package com.xworkz.external;

import com.xworkz.internal.Badge;

public class BadgeExternal {
    public void run(){
        Badge badge = new Badge();

        System.out.println(badge.getBadgeName());
        System.out.println(badge.getBadgeColor());
        System.out.println(badge.getBadgeLevel());
        System.out.println(badge.getBadgeShape());
        System.out.println(badge.getBadgeMaterial());
    }
}
