package com.xworkz.internal;

public class Football extends Game {
    public void scoreGoal() {
        System.out.println("Scoring a football goal");
    }

    @Override
    public void play() {
        System.out.println("Playing football");
    }
}