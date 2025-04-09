package com.xworkz.internal;

public class KeyChainInternal {
    public void runInternal() {
        KeyChain keyChain = new KeyChain();

        System.out.println("----------after updated---------");
        keyChain.setMaterial("Metal");
        keyChain.setColor("Black");
        keyChain.setShape("Round");
        keyChain.setKeyType("Car Key");
        keyChain.setBrand("Titan");

        System.out.println(keyChain.getMaterial());
        System.out.println(keyChain.getColor());
        System.out.println(keyChain.getShape());
        System.out.println(keyChain.getKeyType());
        System.out.println(keyChain.getBrand());
    }

}
