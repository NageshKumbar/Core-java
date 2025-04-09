package com.xworkz.internal;

public class GymInternal {
    public void runInternal(){
        Gym gym = new Gym();

        System.out.println("-------- After Update --------");
        gym.setTrainer("Ramesh");
        gym.setEquipment("Treadmill, Dumbbells");
        gym.setFloorType("Rubber flooring");
        gym.setOpeningHours("6 AM to 10 PM");
        gym.setMembershipType("Premium");

        System.out.println(gym.getTrainer());
        System.out.println(gym.getEquipment());
        System.out.println(gym.getFloorType());
        System.out.println(gym.getOpeningHours());
        System.out.println(gym.getMembershipType());
    }
}
