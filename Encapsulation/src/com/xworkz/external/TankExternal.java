package com.xworkz.external;

import com.xworkz.internal.Tank;

public class TankExternal {
    public void run() {
        Tank tank = new Tank();

        System.out.println(tank.GetCapacity());
        System.out.println(tank.GetMaterial());
        System.out.println(tank.GetColor());
        System.out.println(tank.GetShape());
        System.out.println(tank.GetBrand());
    }
}
