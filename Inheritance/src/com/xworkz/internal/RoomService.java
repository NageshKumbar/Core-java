package com.xworkz.internal;

public class RoomService extends Service {
    public void deliverFood() {
        System.out.println("Delivering room service food");
    }

    @Override
    public void serve() {
        System.out.println("Providing room service");
    }
}