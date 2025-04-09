package com.xworkz.external;

import com.xworkz.internal.Gym;

public class GymExternal {
    public void run(){
        Gym gym = new Gym();
        System.out.println(gym.getTrainer());
        System.out.println(gym.getEquipment());
        System.out.println(gym.getFloorType());
        System.out.println(gym.getOpeningHours());
        System.out.println(gym.getMembershipType());
    }
}
