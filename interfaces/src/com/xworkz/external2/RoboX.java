package com.xworkz.external2;

import com.xworkz.internal.rules2.Robot;

public class RoboX implements Robot {
    public void walk() {
        System.out.println("Robot walking");
    }
    public void talk() {
        System.out.println("Robot talking");
    }
    public void pickObject() {
        System.out.println("Robot picking object");
    }
    public void scanArea() {
        System.out.println("Robot scanning area");
    }
    public void shutdown() {
        System.out.println("Robot shutting down");
    }
}