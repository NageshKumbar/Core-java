package com.xworkz.internal;

public class TankInternal {
    public void runInternal() {
        Tank tank = new Tank();

        System.out.println("----------after updated---------");
        tank.SetCapacity("1000 Litres");
        tank.SetMaterial("Polyethylene");
        tank.SetColor("Blue");
        tank.SetShape("Cylindrical");
        tank.SetBrand("Sintex");

        System.out.println(tank.GetCapacity());
        System.out.println(tank.GetMaterial());
        System.out.println(tank.GetColor());
        System.out.println(tank.GetShape());
        System.out.println(tank.GetBrand());
    }

}
