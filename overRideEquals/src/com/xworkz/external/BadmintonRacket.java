package com.xworkz.external;

import java.util.Objects;

public class BadmintonRacket {
    String brand;
    String gripSize;
    String weight;
    String balance;

    public void setBadmintonRacket(String brand, String gripSize, String weight, String balance) {
        this.brand = brand;
        this.gripSize = gripSize;
        this.weight = weight;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", GripSize = " + gripSize + ", Weight = " + weight + ", Balance = " + balance;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof BadmintonRacket) {
            BadmintonRacket badmintonRacket = (BadmintonRacket) obj;
            if (Objects.equals(this.brand, badmintonRacket.brand) && Objects.equals(this.gripSize, badmintonRacket.gripSize) && Objects.equals(this.weight, badmintonRacket.weight) && Objects.equals(this.balance, badmintonRacket.balance)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
