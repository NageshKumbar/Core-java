package com.xworkz.external;

import com.xworkz.internal.KeyChain;

public class KeyChainExternal {
    public void run() {
        KeyChain keyChain = new KeyChain();

        System.out.println(keyChain.getMaterial());
        System.out.println(keyChain.getColor());
        System.out.println(keyChain.getShape());
        System.out.println(keyChain.getKeyType());
        System.out.println(keyChain.getBrand());
    }
}
