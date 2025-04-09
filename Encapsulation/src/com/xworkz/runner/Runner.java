package com.xworkz.runner;

import com.xworkz.external.*;
import com.xworkz.internal.*;

public class Runner {
    public static void main(String[] args) {
        BuildingExternal buildingExternal=new BuildingExternal();
        buildingExternal.run();
        BuildingInternal buildingInternal=new BuildingInternal();
        buildingInternal.runInternal();
        GymExternal gymExternal = new GymExternal();
        gymExternal.run();
        GymInternal gymInternal = new GymInternal();
        gymInternal.runInternal();
        GarageExternal garageExternal = new GarageExternal();
        garageExternal.run();
        GarageInternal garageInternal = new GarageInternal();
        garageInternal.runInternal();
        JetExternal jetExternal=new JetExternal();
        jetExternal.run();
        JetInternal jetInternal=new JetInternal();
        jetInternal.runInternal();
        OccupationExternal occupationExternal = new OccupationExternal();
        occupationExternal.run();
        OccupationInternal occupationInternal = new OccupationInternal();
        occupationInternal.runInternalOccupation();
        PostOfficeExternal external = new PostOfficeExternal();
        external.run();
        PostOfficeInternal internal = new PostOfficeInternal();
        internal.runInternal();
        BadgeExternal badgeExternal = new BadgeExternal();
        badgeExternal.run();
        BadgeInternal badgeInternal = new BadgeInternal();
        badgeInternal.runInternal();
        TankExternal tankExternal = new TankExternal();
        tankExternal.run();
        TankInternal tankInternal = new TankInternal();
        tankInternal.runInternal();
        KeyChainExternal keyChainExternal = new KeyChainExternal();
        keyChainExternal.run();
        KeyChainInternal keyChainInternal = new KeyChainInternal();
        keyChainInternal.runInternal();
        MutentExternal mutentExternal = new MutentExternal();
        mutentExternal.run();
        MutentInternal mutentInternal = new MutentInternal();
        mutentInternal.runInternal();

    }


}
